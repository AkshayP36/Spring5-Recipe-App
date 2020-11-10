package com.jdbcTesting;


import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTesting {
    //creating strings to store database parameters
    //creating try catch block
    //creating database driver manager
    public static void main(String[] args) {
        String jrbcurl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
        String username = "hbstudent";
        String password = "hbstudent";

        try {
            System.out.println("Connecting to world database");
            Connection connection = DriverManager.getConnection(jrbcurl, username, password);
            System.out.println("Connection to world database sucessful!!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
