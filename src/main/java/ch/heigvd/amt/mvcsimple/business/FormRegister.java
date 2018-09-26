package ch.heigvd.amt.mvcsimple.business;

import ch.heigvd.amt.mvcsimple.model.Form;
import javax.servlet.http.HttpServletRequest;

public class FormRegister {

    private String firstName;
    private String lastName;
    private String email;


    public FormRegister(HttpServletRequest req) {
        firstName = req.getParameter("firstName");
        lastName = req.getParameter("lastName");
        email = req.getParameter("email");
    }

    public boolean checkForm() {
        if (firstName.isEmpty() || lastName.isEmpty() || !email.contains("@")) {
            return false;
        } else {
            return true;
        }
    }

    public Form getForm(){
        Form form = new Form();
        form.setFirstName(firstName);
        form.setLastName(lastName);
        form.setEmail(email);
        return form;
    }

}
