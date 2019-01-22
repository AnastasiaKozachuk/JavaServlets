package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {


    private static final String login = "Anastazia";
    private static final String password = "2222";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String userLogin = request.getParameter("login");
        String userPassword = request.getParameter("password");
        String message ;
        String message2 ;
        if (userLogin.equals(login) && userPassword.equals(password)) {

            message = "Welcome " + userLogin + ", thanks for login...";
            message2 ="Return to login page";
        } else {
            message = "You are not the valid user...";
            message2 ="Try to enter login and password again";
        }

        request.setAttribute("message", message);
        request.setAttribute("message2", message2);
        request.getRequestDispatcher("/Auth.jsp").forward(request, response);
    }
}
