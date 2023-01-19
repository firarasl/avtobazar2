package az.autobazar.web.filter;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.repository.impl.UserRepositoryImpl;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {

    private static final Logger logger = Logger.getLogger(LoginFilter.class.getName());


    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();
        if(session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
            logger.info("user " + user.getEmail() + " has active session, allow continue");
                chain.doFilter(req, resp);
        } else {
            logger.error("user does not have session, redirect to login page");
            response.sendRedirect(request.getServletContext().getContextPath() + "/login");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
