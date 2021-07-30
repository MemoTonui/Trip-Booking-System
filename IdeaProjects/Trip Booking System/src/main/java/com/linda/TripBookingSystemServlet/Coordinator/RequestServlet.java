package com.linda.TripBookingSystemServlet.Coordinator;

import com.linda.TripBookingSystemDao.Coordinator.CoordinatorDao;
import com.linda.TripBookingSystemDao.Coordinator.RequestDao;
import com.linda.TripBoookingSystemBean.Coordinator.RequestBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RequestServlet", value = "/request")
public class RequestServlet extends HttpServlet {
    private RequestDao requestDao;

    public  void  init(){
        requestDao = new RequestDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String faculty = request.getParameter("faculty");
        String department = request.getParameter("department");
        String arrival = request.getParameter("arrival");
        String departure = request.getParameter("departure");
        String location = request.getParameter("location");
        int students = Integer.valueOf(request.getParameter("students"));
        int staff = Integer.parseInt(request.getParameter("staff"));

        RequestBean requestBean = new RequestBean();
        requestBean.setFirst_name(first_name);
        requestBean.setLast_name(last_name);
        requestBean.setEmail(email);
        requestBean.setPassword(password);
        requestBean.setFaculty(faculty);
        requestBean.setDepartment(department);
        requestBean.setArrival(arrival);
        requestBean.setDeparture(departure);
        requestBean.setStaff(staff);
        requestBean.setStudents(students);
        requestBean.setLocation(location);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
