package com.zorba.service;

import com.zorba.dao.StudentDAOSir;
import com.zorba.model.StudentSir;

public class StudentServiceSir {
	
	static StudentDAOSir dao = new StudentDAOSir();
	
	public static void main(String[] args) {
			
	}


	public void studentRegistartion(StudentSir student) {
		dao.save(student);
		
	}
	
	
}
