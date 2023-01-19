package az.autobazar.service.impl;

import az.autobazar.repository.UserRepository;
import az.autobazar.service.ValidationService;
import az.autobazar.web.form.RegistrationForm;
import org.apache.commons.validator.GenericValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static az.autobazar.constants.ValidationConstants.*;

public class ValidationServiceImpl implements ValidationService {

    private UserRepository userRepository;

    public ValidationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Map<String, List<String>> validateRegistrationForm(RegistrationForm form) {
        Map<String, List<String>> validationErrorMap = new HashMap<>();

        // validate name
        // not null, not empty
        // min length, max length
        // chars only

        List<String> nameErrors = new ArrayList<>();
        String regex_azerbaijani_string="^[a-zA-ZöüƏəşŞçÇĞğÖÜ]+$";
        String regex_phone="^(\\+?)\\d{12}(\\d{2})?$";

        if(GenericValidator.isBlankOrNull(form.getName())) {
            nameErrors.add("Ad bos ola bilmez");
        } else {
            if(!GenericValidator.isInRange(form.getName().length(), NAME_MIN_LENGTH, NAME_MAX_LENGTH)) {
                nameErrors.add(String.format("Ad min %d, max %d herf ola biler", NAME_MIN_LENGTH, NAME_MAX_LENGTH));
            }

            // todo validate chars only a-z, A-Z, milli herfler


            if(!form.getName().matches(regex_azerbaijani_string)){
                nameErrors.add("Ad ancaq heriflerden ibaret olmalidir!");
            }
        }

        if(!nameErrors.isEmpty()) {
            validationErrorMap.put(NAME, nameErrors);
        }

        // validate surname
        List<String> surnameErrors = new ArrayList<>();
        if(GenericValidator.isBlankOrNull(form.getSurname())) {
            surnameErrors.add("Soyad bos ola bilmez");
        } else {
            if(!GenericValidator.isInRange(form.getSurname().length(), SURNAME_MIN_LENGTH, SURNAME_MAX_LENGTH)) {
                surnameErrors.add(String.format("Soyad min %d, max %d herf ola biler", SURNAME_MIN_LENGTH, SURNAME_MAX_LENGTH));
            }

            // todo validate chars only a-z, A-Z, milli herfler

            if(!form.getSurname().matches(regex_azerbaijani_string)){
                nameErrors.add("Soyad ancaq heriflerden ibaret olmalidir!");
            }

        }

        if(!surnameErrors.isEmpty()) {
            validationErrorMap.put(SURNAME, surnameErrors);
        }

        // validate email
        // not null, not empty
        // email regex
        // min/max length
        // duplicate check
        List<String> emailErrors = new ArrayList<>();
        if(GenericValidator.isBlankOrNull(form.getEmail())) {
            emailErrors.add("Email mecburidir");
        } else {
            if(!GenericValidator.isEmail(form.getEmail())) {
                emailErrors.add("Email yanlisdir");
            }
            if(!GenericValidator.isInRange(form.getEmail().length(),EMAIL_MIN_LENGTH,EMAIL_MAX_LENGTH)){
                emailErrors.add(String.format("Email min %d, max %d herf tuta biler", EMAIL_MIN_LENGTH, EMAIL_MAX_LENGTH));
            }



            // todo min/max length

            if(userRepository.checkEmail(form.getEmail())) {
                emailErrors.add("Email artiq qeydiyyatdan kecib");
            }

        }

        if(!emailErrors.isEmpty()) {
            validationErrorMap.put(EMAIL, emailErrors);
        }

        // TODO validate phone

        List<String> phoneErrors=new ArrayList<>();
        if(GenericValidator.isBlankOrNull(form.getPhone())){
            phoneErrors.add("Mobil nomre mecburdir!");
        }else {
            if(!form.getPhone().matches(regex_phone)){
                phoneErrors.add("Mobil nomre yalnisdir!");
            }

            if(!GenericValidator.isInRange(form.getPhone().length(),PHONE_MIN_LENGTH,PHONE_MAX_LENGTH)){
                phoneErrors.add(String.format("Mobil nomre min %d, max %d regem tuta biler", PHONE_MIN_LENGTH, PHONE_MAX_LENGTH));
            }


            if(userRepository.checkMobile((form.getPhone()))){
                phoneErrors.add("Mobil artiq geydiyatdan kecib");
            }
        }
        if(!phoneErrors.isEmpty()){
            validationErrorMap.put(PHONE,phoneErrors);
        }

        // not null, not empty
        // phone regex
        // min/max length
        // duplicate check




        List<String> passwordErrors=new ArrayList<>();
        if (GenericValidator.isBlankOrNull(form.getPassword())){
            passwordErrors.add("Şifre boş ola bilmez!");
        }
        else{
            if (!GenericValidator.minLength(form.getPassword(),PASSWORD_MIN_LENGTH)){
                passwordErrors.add(String.format("Sizin sifreniz %d simboldan cox olmalidir!",PASSWORD_MIN_LENGTH));
            }

            if (!form.getPassword().equals(form.getPasswordConfirmation())){
                passwordErrors.add("Sizin passwordunuz ve password confirmationuz uygun deyirler bir birlerine");
            }
        }

        if(!passwordErrors.isEmpty()){
            validationErrorMap.put(PASSWORD,passwordErrors);
        }


        // TODO validate password and password confirm
        // not null, not empty
        // min length
        // password == password confirm

        return validationErrorMap;
    }
}
