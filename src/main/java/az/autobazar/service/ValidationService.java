package az.autobazar.service;

import az.autobazar.web.form.RegistrationForm;

import java.util.List;
import java.util.Map;

public interface ValidationService {

    Map<String, List<String>> validateRegistrationForm(RegistrationForm form);
}
