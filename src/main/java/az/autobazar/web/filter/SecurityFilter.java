package az.autobazar.web.filter;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SecurityFilter implements Filter {
    private static final Logger logger = Logger.getLogger(SecurityFilter.class.getName());


    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();
        if(session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
            logger.debug("user roles = " + user.getRoleList());

            if(user.getRoleList()
                    .stream()
                    .anyMatch(r -> r.getId() == Role.AUTOBAZAR_ADMIN.getId())) {
                logger.info("user " + user.getEmail() + " has admin role, allow");
                chain.doFilter(req, resp);
            } else {
                logger.error("user " + user.getEmail() + " does not have admin role, redirect to access denied page");
                response.sendRedirect(request.getServletContext().getContextPath() + "/access-denied.jsp");
            }
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
