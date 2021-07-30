package com.linda.TripBookingSystemDao.Coordinator;

import com.linda.TripBoookingSystemBean.Coordinator.CoordinatorBean;
import com.linda.TripBoookingSystemBean.Coordinator.RequestBean;

import java.sql.*;

public class CoordinatorDao {
    public int registerCoordinator(CoordinatorBean coordinatorBean) throws ClassNotFoundException {
        String INSERT_COORDINATORS = "INSERT INTO coordinator VALUES ?,?,?,?;";
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tripbookingsystem?useSSL=false", "root", "chepkemoi.");

            PreparedStatement preparedStatement = con.prepareStatement(INSERT_COORDINATORS);
            preparedStatement.setString(1, coordinatorBean.getFirst_name());
            preparedStatement.setString(2, coordinatorBean.getLast_name());
            preparedStatement.setString(3, coordinatorBean.getEmail());
            preparedStatement.setString(4, coordinatorBean.getPassword());


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


