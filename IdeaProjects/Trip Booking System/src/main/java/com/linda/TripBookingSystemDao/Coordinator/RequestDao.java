package com.linda.TripBookingSystemDao.Coordinator;

import com.linda.TripBoookingSystemBean.Coordinator.RequestBean;

import java.sql.*;

public class RequestDao {
    public int addRequest(RequestBean requestBean) throws ClassNotFoundException {
        String INSERT_REQUEST = "INSERT INTO request VALUES ?,?,?,?,?,?,?,?,?,?,?;";
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tripbookingsystem?useSSL=false", "root", "chepkemoi.");

            PreparedStatement preparedStatement = con.prepareStatement(INSERT_REQUEST);
            preparedStatement.setString(1, requestBean.getFirst_name());
            preparedStatement.setString(2, requestBean.getLast_name());
            preparedStatement.setString(3, requestBean.getEmail());
            preparedStatement.setString(4, requestBean.getPassword());
            preparedStatement.setString(5, requestBean.getFaculty());
            preparedStatement.setString(6, requestBean.getDepartment());

            preparedStatement.setInt(7, requestBean.getStaff());
            preparedStatement.setInt(8, requestBean.getStudents());
            preparedStatement.setString(9,  requestBean.getDeparture());
            preparedStatement.setString(10, requestBean.getArrival());
            preparedStatement.setString(11,requestBean.getLocation());

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}


