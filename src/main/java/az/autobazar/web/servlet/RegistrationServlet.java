package az.autobazar.web.servlet;

import az.autobazar.domain.User;
import az.autobazar.service.UserService;
import az.autobazar.service.ValidationService;
import az.autobazar.util.RegistrationFormUtil;
import az.autobazar.util.ServiceUtil;
import az.autobazar.web.form.RegistrationForm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static az.autobazar.constants.WebConstants.REGISTRATION_ERROR_MAP;
import static az.autobazar.constants.WebConstants.REGISTRATION_FORM;

@WebServlet(name = "RegistrationServlet", value = "/register")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.read registration form parameters
        // 2.validate parameters
        // 3.show validation errors
        // 4.register user
        // 4.1.insert into user
        // 4.2.insert into user role
        // 4.3.generate token and insert token
        // 4.4.send activation email

        /*
                    * name
            surname
            email
            phone
            password
            password_confirm
        * */

        // 1.read registration form parameters
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("password_confirm");

        RegistrationForm form = new RegistrationForm();
        form.setName(name);
        form.setSurname(surname);
        form.setEmail(email);
        form.setPassword(password);
        form.setPasswordConfirmation(passwordConfirmation);
        form.setPhone(phone);


        ValidationService validationService = ServiceUtil.getValidationService(getServletContext());
        Map<String, List<String>> validationErrorMap = validationService.validateRegistrationForm(form);

        if(!validationErrorMap.keySet().isEmpty()) {
            // reg form is not valid
            // save validation errors in request scope
            request.setAttribute(REGISTRATION_ERROR_MAP, validationErrorMap);
            request.setAttribute(REGISTRATION_FORM, form);
            request.getRequestDispatcher("/WEB-INF/jsp/web/register.jsp").forward(request, response);
        } else {
            // todo implement 4.register user
            User user = RegistrationFormUtil.convert(form);
            // 4.register user
            // 4.1.insert into user
            // 4.2.insert into user role
            // 4.3.generate token and insert token
            // 4.4.send activation email

            UserService userService = ServiceUtil.getUserService(getServletContext());
            userService.addUser(user);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = "/WEB-INF/jsp/web/register.jsp";
        request.getRequestDispatcher(page).forward(request, response);
    }
}
