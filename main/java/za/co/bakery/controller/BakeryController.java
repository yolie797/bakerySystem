package za.co.bakery.controller;

import za.co.bakery.process.ProcessRequest;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bakery.db.manager.DBManager;
import za.co.bakery.process.LoginProcess;
import za.co.bakery.process.RegistrationProcess;

@WebServlet(name = "BakeryController", urlPatterns = {"/bakery"})
public class BakeryController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String process = request.getParameter("pro");
        if (process != null) {
            ProcessRequest pr = RequestFactory.createProcess(process, request);
            if (pr != null) {
                pr.processRequest(request, response);
                pr.processResponse(request, response);
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

abstract class RequestFactory {

    public static ProcessRequest createProcess(String process, HttpServletRequest request) {

        switch (process.toLowerCase()) {
            case "li":      //Login
                return new LoginProcess();
            case "ua":
            case "rp":
                return new RegistrationProcess();
            case "ca":      //Catalog Add
                return null;
        }

        return null;
    }
}
