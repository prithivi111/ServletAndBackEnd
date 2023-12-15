package com.zorba.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zorba.model.StudentSir;
import com.zorba.service.StudentServiceSir;

@WebServlet("/SaveServlet")
public class SaveServletSir extends HttpServlet {
	
  //Practice
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		int mobile = Integer.parseInt(request.getParameter(" mobile"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cPassowrd = request.getParameter("cPassword");
		
		StudentSir student = new StudentSir();
		student.setName(name);
		student.setAddress(address);
		student.setMobile(mobile);
		student.setEmail(email);
		student.setPassword(password);
		student.setcPassword(cPassowrd);
		
		StudentServiceSir service = new StudentServiceSir();
		service.studentRegistartion(student);
	
		//
	}

}
