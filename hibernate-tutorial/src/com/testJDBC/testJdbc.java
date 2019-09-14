package com.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class testJdbc {
	
	public static void main(String[] args) {
		
		String jdbcURL="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String password="saiftak@001";
		
		try {
			
			System.out.println("Connection to database "+jdbcURL);
			Connection connect= DriverManager.getConnection(jdbcURL, user, password);
			System.out.println("Connection successful !!");
			connect.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
