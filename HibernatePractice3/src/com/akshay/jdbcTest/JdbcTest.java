package com.akshay.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {

    static String jdbcurl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
    static String username = "hbstudent";
    static String password = "hbstudent";
    public static void main(String[] args){

        //Adding jdbcurl, username, password
        //creating try catch and finally block
        //adding driver manager class and test the connection

       try{

           System.out.println("Java code trying to conenct to the Database");
           Connection connection = DriverManager.getConnection(jdbcurl,username,password);

           System.out.println("Sucessfully conencted to the database!!!!!!!!!");
       } catch(Exception e){
           e.printStackTrace();
       }

    }
}
