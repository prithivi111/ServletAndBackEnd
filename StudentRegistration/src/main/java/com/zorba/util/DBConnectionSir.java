package com.zorba.util;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnectionSir {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //This is SQL driver name. This is different for different database like Postgrace, Oracle
			//We use Class.forName, to load the Class.
			//Here, we are trying to load the Class of driver.
			//If we check the Class Driver then you will find the static block. Instead of writing the those static block,
			//which gets loaded while executing the program, we directly mention the SQL driver here.
	 
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentregistration", "root", "Suraj123@");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
 