package com.linda.TripBookingSystem;



import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "TransportOfficerLoginServlet", value = "/TransportOfficerLoginServlet")
public class TransportOfficerLoginServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    //private com.linda.TripBookingSystem.myConnector myConnector;
   private myConnector myConnector;
    @Override
    public void init(){
        myConnector=new myConnector();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //Getting request parameters username and password from the request object
            String email= request.getParameter("email");
            String password=request.getParameter("password");
            
            //setting userName and password to transportOfficer object
            TransportOfficer transportOfficer=new TransportOfficer();
            transportOfficer.setEmail(email);
            transportOfficer.setPassword(password);
            
            //check to see if the username and password are in the database
            if (myConnector.validate(transportOfficer)){
                response.sendRedirect("transportOfficerLogin.jsp");
            }
            else{
                //creating a session to hold logged in user by username
                HttpSession session=request.getSession();
                session.setAttribute("email",email);
                //Redirect to loginSuccess.html on successful login
                response.sendRedirect("loginSuccess.html");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransportOfficerLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
