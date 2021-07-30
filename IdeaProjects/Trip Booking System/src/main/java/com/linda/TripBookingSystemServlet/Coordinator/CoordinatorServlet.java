package com.linda.TripBookingSystemServlet.Coordinator;

import com.linda.TripBookingSystemDao.Coordinator.CoordinatorDao;
import com.linda.TripBoookingSystemBean.Coordinator.CoordinatorBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CoordinatorServlet", value = "/coordinator")
public class CoordinatorServlet extends HttpServlet {
    CoordinatorDao coordinatorDao;

    public  void init(){
        coordinatorDao = new CoordinatorDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        CoordinatorBean coordinatorBean = new CoordinatorBean();
        coordinatorBean.setFirst_name(first_name);
        coordinatorBean.setLast_name(last_name);
        coordinatorBean.setEmail(email);
        coordinatorBean.setPassword(password);


        try{
            int status = coordinatorDao.registerCoordinator(coordinatorBean);
            if (status>0){
                response.sendRedirect("login.jsp");
            }else{
                response.sendRedirect("Registration.jsp");
            }
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
