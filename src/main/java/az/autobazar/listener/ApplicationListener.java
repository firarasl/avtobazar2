package az.autobazar.listener;

import az.autobazar.repository.AutoRepository;
import az.autobazar.repository.UserRepository;
import az.autobazar.repository.impl.AutoRepositoryImpl;
import az.autobazar.repository.impl.UserRepositoryImpl;
import az.autobazar.service.AutoService;
import az.autobazar.service.UserService;
import az.autobazar.service.ValidationService;
import az.autobazar.service.impl.AutoServiceImpl;
import az.autobazar.service.impl.UserServiceImpl;
import az.autobazar.service.impl.ValidationServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import static az.autobazar.constants.WebConstants.*;

@WebListener()
public class ApplicationListener implements ServletContextListener {

    // Public constructor is required by servlet spec
    public ApplicationListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("AutoBazar2 context initialized");
        // todo add log4j

        AutoRepository autoRepository = new AutoRepositoryImpl();
        String uploadFolder = sce.getServletContext().getInitParameter("upload-folder");

        AutoService autoService = new AutoServiceImpl(autoRepository, uploadFolder);

        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserServiceImpl(userRepository);

        ValidationService validationService = new ValidationServiceImpl(userRepository);

        sce.getServletContext().setAttribute(AUTO_REPOSITORY, autoRepository);
        sce.getServletContext().setAttribute(AUTO_SERVICE, autoService);

        sce.getServletContext().setAttribute(USER_REPOSITORY, userRepository);
        sce.getServletContext().setAttribute(USER_SERVICE, userService);

        sce.getServletContext().setAttribute(VALIDATION_SERVICE, validationService);

    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("AutoBazar2 context destroyed");

        sce.getServletContext().removeAttribute(AUTO_REPOSITORY);
        sce.getServletContext().removeAttribute(AUTO_SERVICE);

        sce.getServletContext().removeAttribute(USER_REPOSITORY);
        sce.getServletContext().removeAttribute(USER_SERVICE);

        sce.getServletContext().removeAttribute(VALIDATION_SERVICE);

    }

}
