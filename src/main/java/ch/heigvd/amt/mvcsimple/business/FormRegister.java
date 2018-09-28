package ch.heigvd.amt.mvcsimple.business;

import ch.heigvd.amt.mvcsimple.model.Form;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class FormRegister {

    private String firstName;
    private String lastName;
    private String email;
    private HashMap<String,String> errors;

    public FormRegister(HttpServletRequest req) {
        firstName = req.getParameter("firstName");
        lastName = req.getParameter("lastName");
        email = req.getParameter("email");
        errors = new HashMap<>();
    }

    public boolean checkForm() {
        if (firstName.isEmpty()) {
            errors.put("firstNameError", "Erreur dans le prénom");
        } else if (lastName.isEmpty()) {
            errors.put("lastNameError", "Erreur dans le nom");
        } else if (email.isEmpty() || !email.contains("@")) {
            errors.put("emailError", "Erreur dans l'email");
        }

        if (errors.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public Form getForm(){
        Form form = new Form();
        form.setFirstName(firstName);
        form.setLastName(lastName);
        form.setEmail(email);
        return form;
    }

}
