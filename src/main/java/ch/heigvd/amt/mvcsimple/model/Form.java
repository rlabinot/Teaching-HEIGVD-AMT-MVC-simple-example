package ch.heigvd.amt.mvcsimple.model;

import javax.servlet.http.HttpServletRequest;

public class Form {

    private String firstName = "first name";
    private String lastName = "last name";
    private String email = "email";

    public Form() {}

    Form(javax.servlet.http.HttpServletRequest req) {
        this.firstName = req.getParameter("firstName");
        this.lastName = req.getParameter("lastName");
        this.email = req.getParameter("email");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
