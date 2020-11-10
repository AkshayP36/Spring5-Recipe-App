package com.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConenction {
    public static void main(String[] args){
        String jdbcurl = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
        String username = "hb_practice1";
        String password = "hb_practice1";

        try{

            System.out.println("Conencting to the db server = "+jdbcurl);
            Connection connection = DriverManager.getConnection(jdbcurl,username,password);
            System.out.println("Connection successful!!");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
