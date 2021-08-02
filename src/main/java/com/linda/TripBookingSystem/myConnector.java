package com.linda.TripBookingSystem;

import com.linda.TripBookingSystem.TransportOfficer;

import java.sql.*;

public class myConnector {
           public boolean validate(TransportOfficer transportOfficer) throws  ClassNotFoundException{
               boolean status =false;

               Class.forName("com.mysql.jdbc.Driver");
               try(Connection connection= DriverManager.
                       getConnection("jdbc:mysql://localhost:3306/transport?useSSL=false","jared","fwaya");

                   //Create a statement
                   PreparedStatement preparedStatement= connection
                           .prepareStatement("select email, password from TransportOfficer where username= ? and password = ?");
               ){
                   preparedStatement.setString(1,transportOfficer.getEmail());
                   preparedStatement.setString(2,transportOfficer.getPassword());

                   System.out.println(preparedStatement);

                   ResultSet resultSet=preparedStatement.executeQuery();
                   status=resultSet.next();

               } catch (SQLException throwables) {
                   throwables.printStackTrace();
               }

               return  status;
           }
}
