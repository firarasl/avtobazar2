package az.autobazar.util;

import az.autobazar.repository.AutoRepository;
import az.autobazar.repository.UserRepository;
import az.autobazar.service.AutoService;
import az.autobazar.service.UserService;
import az.autobazar.service.ValidationService;

import javax.servlet.ServletContext;

import static az.autobazar.constants.WebConstants.*;

public class ServiceUtil {

    public static AutoService getAutoService(ServletContext context) {
        return (AutoService) context.getAttribute(AUTO_SERVICE);
    }

    public static AutoRepository getAutoRepository(ServletContext context) {
        return (AutoRepository) context.getAttribute(AUTO_REPOSITORY);
    }

    public static UserRepository getUserRepository(ServletContext context) {
        return (UserRepository) context.getAttribute(USER_REPOSITORY);
    }

    public static UserService getUserService(ServletContext context) {
        return (UserService) context.getAttribute(USER_SERVICE);
    }

    public static ValidationService getValidationService(ServletContext context) {
        return (ValidationService) context.getAttribute(VALIDATION_SERVICE);
    }
}
