package za.co.bakery.process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bakery.db.manager.DBManager;
import za.co.bakery.model.User;
import za.co.bakery.service.UserService;
import za.co.bakery.serviceImpl.UserServiceImpl;

public class LoginProcess implements ProcessRequest {

    private UserService userService;

    @Override
    public void processRequest(HttpServletRequest request, HttpServletResponse response) {

        DBManager dBManager = (DBManager) request.getServletContext().getAttribute("dbmanager");
        String process = request.getParameter("pro");
        switch (process.toLowerCase()) {
            case "li":
                String username = request.getParameter("username");   //this is infact the users email address
                String password = request.getParameter("password");
                if (username != null && password != null) {
                    username = username.trim().toLowerCase();
                    password = password.trim();
                    if (!username.isEmpty() && !password.isEmpty()) {
                        if (dBManager != null) {
                            User user = new User(username, password);
                            userService = new UserServiceImpl(dBManager);
                            User loggedInUser = userService.userLogin(user);
                            request.setAttribute("theUser", loggedInUser);
                        }
                    }
                }
                break;
            case "ca":
                System.out.println("DO Me");
                break;
        }
    }

    @Override
    public void processResponse(HttpServletRequest request, HttpServletResponse response) {

        //call Yolanda's Views
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            User user = (User) request.getAttribute("theUser");
            if (user != null) {
                RequestDispatcher rd= request.getRequestDispatcher("components\\home.jsp");
                try {
                    rd.forward(request, response);
                } catch (ServletException ex) {
                }
               // pw.println("The user: " + user.toString());
            } else {
                pw.println("The user is INVALID. DO not forget to create an error page!");
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }

}
