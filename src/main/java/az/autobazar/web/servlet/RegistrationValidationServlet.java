package az.autobazar.web.servlet;

import az.autobazar.service.UserService;
import az.autobazar.util.ServiceUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationValidationServlet", value = "/reg-validate")
public class RegistrationValidationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");



        boolean result = false;
        UserService userService = ServiceUtil.getUserService(getServletContext());

        if(email != null && !email.isEmpty()) {
            result = userService.checkEmail(email);
        } else if(mobile != null && !mobile.isEmpty()){
            result = userService.checkMobile(mobile);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        response.setContentType("application/json");
        response.getWriter().print(result);
    }
}
