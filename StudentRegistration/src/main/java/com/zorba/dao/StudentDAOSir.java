package com.zorba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zorba.model.StudentSir;
import com.zorba.util.DBConnectionSir;


public class StudentDAOSir {
	
	public int save (StudentSir std) {
		
		int status = 0;
		
		try {
			//establish database connection
			Connection conn = DBConnectionSir.getConnection();
			//Here Connection is an interface and we cannot create the object of the interface directly.
			//Luckily we have getConnection method in this Connection method which will give you the instance of 
			// of Connection interface which gets stored in 'conn'.
			
			//writing the SQL insert query. This is general query
			String sql = "insert into student (name, address, mobile, email, password, cPassword)" + "values (?,?,?,?,?,?)";
						//the student is the table name
			//The database engine might not understand the JAVA query so this needs to be converted into DB understable form and we use
			//Prepared statement. So, Prepared statement query - converting SQL to respective DB standard query.
			//If I am using SQL then prepared statement will convert into SQL standard, if we are using Postgrace then prepared
			//statement will convert into Postgrace standard.
			
			PreparedStatement ps = conn.prepareStatement(sql);
			//Here PreparedStatement is an interface, and prepareStatement is a method which helps in preparing the statements.
			//We are instantiating a object of PreaparedStatement ie. 'ps' and trying to store the entire database statments. 
			
			ps.setString(1, std.getName());
			ps.setString(2, std.getAddress());
			ps.setInt(3, std.getMobile());
			ps.setString(4, std.getEmail());
			ps.setString(5, std.getPassword());
			ps.setString(6, std.getcPassword());
			
			//executing SQL query
			status = ps.executeUpdate();
			//If the execution happens successfully then the executeUpdate() method will return 1 else O;
			//The execution method is written in that way, you have to go and check
			
			System.out.println("Data inserted successfully");
			//this is just printing on the console 
			
			ps.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			//You have to close your connection in the finally block if possible.
		}
		
		return status;	
	}
	
}
