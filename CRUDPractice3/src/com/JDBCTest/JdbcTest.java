package com.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    //Create string to store database conenction parameters
    //create driver manager class instance and test the conenction

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
        String username = "hbstudent";
        String password = "hbstudent";

        try {
            System.out.println("Conenct to the database...");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection to database sucessful!!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
