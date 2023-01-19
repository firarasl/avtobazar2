package az.autobazar.web.servlet;

import az.autobazar.domain.User;
import az.autobazar.web.filter.LoginFilter;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(LogoutServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if(session != null) {
            User user = (User) session.getAttribute("user");
            logger.info("invalidate user session " + user.getEmail());
            session.invalidate();
        }

        logger.info("redirect to login page");
        response.sendRedirect(getServletContext().getContextPath() + "/login");
    }
}
