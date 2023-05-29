
package za.co.bakery.process;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.bakery.service.UserService;


public class EditUserProcess implements ProcessRequest{

    private UserService userService;
    
    @Override
    public void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
