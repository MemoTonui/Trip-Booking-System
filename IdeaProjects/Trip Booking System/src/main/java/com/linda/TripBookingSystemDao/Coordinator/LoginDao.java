package com.linda.TripBookingSystemDao.Coordinator;

import com.linda.TripBoookingSystemBean.Coordinator.LoginBean;

import java.sql.*;

public class LoginDao {
   // private Connection con;

    public boolean validate (LoginBean loginBean) throws  ClassNotFoundException{
        //Initializes the status of the connection to TRUE
        boolean status = false;
        Class.forName("com.mysql.cj.jdbc.Driver");


        //Establish a connection with MySQL database
        try {
             Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tripbookingsystem?useSSL=false", "root", "chepkemoi.");

            //Create a Statement using connection object
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM login WHERE email=? and password =?");
            preparedStatement.setString(1,loginBean.getEmail());
            preparedStatement.setString(2, loginBean.getPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();
        }
        catch (SQLException e){
            //Process the SQL Exception
            printSQLException(e);
        }
return status;
    }

    private void  printSQLException(SQLException exception){
        /* For each error/exception in the SQL Exception, if the error is an instance of
         * an SQL Exception, Print the SQL State, Error Code, and the Message it gives back.*/
        for (Throwable e: exception){
            if(e instanceof SQLException){
                e.printStackTrace(System.err);
                System.err.println("SQL STate:" + ((SQLException)e).getSQLState());
                System.err.println("Error Code:"+((SQLException)e).getErrorCode());
                System.err.println("Message:"+ e.getMessage());

                Throwable t = exception.getCause();

                //Gives the exception that causes of this exception/ error
                while (t != null){
                    System.out.println("Cause" + t);
                    t= t.getCause();
                }
            }
        }
    }
}
