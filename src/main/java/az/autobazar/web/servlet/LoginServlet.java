package az.autobazar.web.servlet;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.domain.UserStatus;
import az.autobazar.repository.impl.UserRepositoryImpl;
import az.autobazar.service.UserService;
import az.autobazar.util.ServiceUtil;
import org.apache.log4j.Logger;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(LoginServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read login form parameters

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String page = "/WEB-INF/jsp/web/login.jsp";
        // get user by mail
        UserService userService = ServiceUtil.getUserService(getServletContext());
        Optional<User> optionalUser = userService.getUserByEmail(email);

        boolean loginSuccess = false;
        String errorMessage = "";

        try {


            if (optionalUser.isPresent()) {
                User user = optionalUser.get();

                // validate user email, password, status
                if (BCrypt.checkpw(password, user.getPassword())) {
                    // username/password correct, validate user status

                    if (user.getUserStatus() == UserStatus.ACTIVE) {
                        // user/password valid, status active, allow login
                        // get user roles and identify next page
                        List<Role> roleList = userService.getUserRoles(user.getId());
                        logger.debug("user roles = " + roleList);
                        user.setRoleList(roleList);

                        page = roleList.get(0).getSuccessPage();
                        loginSuccess = true;

                        HttpSession session = request.getSession();
                        session.setAttribute("user", user);

                    }else if (user.getUserStatus() == UserStatus.PENDING){
                        loginSuccess = false;
                        errorMessage = "profiliniz hele aktiv deyil, zehmet olmazsa aktivleshdirin!";
                    }else{
                        loginSuccess =false;
                        errorMessage = "profiliniz silinib!:)";
                    }
                } else {
                    // username or password not valid
                    loginSuccess = false;
                    errorMessage = "Email ve ya parol dogru deyil!";
                }
            } else {
                // account not exists
                errorMessage = "Bele istifadeci movcud deyil!";
                loginSuccess = false;
            }

        }catch (Exception e){
            logger.error("error on login for user " + email);
            errorMessage = "girish zamani texniki xeta bash verdi, tekrar cehd edin";
            loginSuccess = false;
        }

        // show validation errors if necessary
        // forward/redirect to next page

        if (loginSuccess){
            response.sendRedirect(getServletContext().getContextPath()+page);
        }else {
            request.setAttribute("errorMessage",errorMessage);
            request.getRequestDispatcher(page).forward(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/web/login.jsp").forward(request, response);
    }
}
