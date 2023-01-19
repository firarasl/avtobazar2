package az.autobazar.web.servlet;

import az.autobazar.domain.Auto;
import az.autobazar.domain.DataTableResult;
import az.autobazar.repository.impl.AutoRepositoryImpl;
import az.autobazar.service.AutoService;
import az.autobazar.util.ServiceUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControllerServlet", value = "/cs")
public class ControllerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = "";
        String applicationContext = getServletContext().getContextPath();
        getServletContext().setAttribute("applicationContext", applicationContext);

        System.out.println("applicationContext = " + applicationContext);

        if(request.getParameter("action") != null) {
            action = request.getParameter("action");
        }

        String page;

        if(action.equalsIgnoreCase("viewAutoList")) {
            AutoRepositoryImpl autoRepositoryImpl = new AutoRepositoryImpl();
            List<Auto> autoList = autoRepositoryImpl.getAutoList();
            request.setAttribute("autoList", autoList);
            page = "/WEB-INF/jsp/auto-list.jsp";
        } else if(action.equalsIgnoreCase("viewAutoById")) {
          //long id = request.getParameter("id");
          page = "/WEB-INF/jsp/auto.jsp";
        } else if(action.equalsIgnoreCase("viewAutoListAjax")) {
            page = "/WEB-INF/jsp/auto-list-ajax.jsp";
        } else if(action.equalsIgnoreCase("getAutoListAjax")) {
            int draw = Integer.parseInt(request.getParameter("draw"));
            int start = Integer.parseInt(request.getParameter("start"));
            int length = Integer.parseInt(request.getParameter("length"));

//            AutoService autoService = (AutoService) getServletContext().getAttribute(WebConstants.AUTO_SERVICE);
            AutoService autoService = ServiceUtil.getAutoService(getServletContext());
            DataTableResult dataTableResult = autoService.getAutoList(draw, start, length);
            request.setAttribute("dataTableResult", dataTableResult);

            // todo forward to servlet
            page = "/WEB-INF/jsp/auto-json.jsp";
        } else {
            AutoRepositoryImpl autoRepositoryImpl = new AutoRepositoryImpl();
            List<Auto> lastAutos = autoRepositoryImpl.getLast12Autos();
            request.setAttribute("lastAutos", lastAutos);
            AutoRepositoryImpl repo = new AutoRepositoryImpl();

            List<Auto> brandList=repo.getQuantityOfBrands();
            request.setAttribute("brandList", brandList);
            page = "/WEB-INF/jsp/web/index.jsp";
        }

        request.getRequestDispatcher(page).forward(request, response);

    }
}
