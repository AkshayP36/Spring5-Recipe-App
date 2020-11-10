package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBCConnection {

	//defining static variables to be called from the main methods -> don't want to change the values
	static String jdbcUrl="jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false&serverTimezone=UTC";
	static String user = "hbstudent";
	static String pass = "hbstudent";
	
	public static void main(String[] args) {
		
		try{
			
			System.out.println("Testing connection : Java code->Hibernate->Mysql JDBC->MySQL Database user -> mysql database");
			
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("JDBC Connection sucessful!!");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		
		
		
	}

}
