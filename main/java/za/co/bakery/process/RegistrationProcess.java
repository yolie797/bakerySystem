package za.co.bakery.process;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bakery.db.manager.DBManager;
import za.co.bakery.model.User;
import za.co.bakery.service.UserService;
import za.co.bakery.serviceImpl.UserServiceImpl;

public class RegistrationProcess implements ProcessRequest {

    private UserService userService;

    @Override
    public void processRequest(HttpServletRequest request, HttpServletResponse response) {
        DBManager dBManager = (DBManager) request.getServletContext().getAttribute("dbmanager");
        String process = request.getParameter("pro");
        switch (process.toLowerCase()) {
            case "rp":
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                String title = request.getParameter("title");
                String phonenumber = request.getParameter("phonenumber");
                String role = "customer"; /*request.getParameter("role");*/
                boolean active = true; /*Boolean.parseBoolean(request.getParameter("active"));*/
                if (username != null && password != null && firstname != null && lastname != null && title != null && phonenumber != null) {
                    username = username.trim().toLowerCase();
                    password = password.trim();
                    firstname = firstname.trim();
                    lastname = lastname.trim();
                    title = title.trim();
                    phonenumber = phonenumber.trim();
                    if (!username.isEmpty() && !password.isEmpty() && !firstname.isEmpty() && !lastname.isEmpty() && !title.isEmpty() && !phonenumber.isEmpty()) {
                        if (dBManager != null) {
                            User user = new User(username, firstname, lastname, title, password, phonenumber, role, active);
                            userService = new UserServiceImpl(dBManager);
                            userService.addUser(user);
                            //request.setAttribute("theUser", loggedInUser);
                        }
                    }
                }
                break;

            case "ca":
                System.out.println("moosaaa");
                break;
        }
    }

    @Override
    public void processResponse(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp\\login.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException ex) {
            System.out.println("Error Dispatching view: " + ex.getMessage());
        }
    }
}
