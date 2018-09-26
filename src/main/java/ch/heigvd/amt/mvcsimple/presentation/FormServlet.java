package ch.heigvd.amt.mvcsimple.presentation;

import ch.heigvd.amt.mvcsimple.business.FormRegister;
import ch.heigvd.amt.mvcsimple.model.Form;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;

public class FormServlet extends javax.servlet.http.HttpServlet {

    private FormRegister service; // we will see later how to replace this with dependency injection

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        FormRegister formRegister = new FormRegister(request);
        Form form = formRegister.getForm();
        request.setAttribute("form", form);

        if (formRegister.checkForm()) {
            request.getRequestDispatcher("/WEB-INF/pages/form.jsp").forward(request, response);
        } else {
            System.out.println("Erreur dans la validation du formulaire!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

}
