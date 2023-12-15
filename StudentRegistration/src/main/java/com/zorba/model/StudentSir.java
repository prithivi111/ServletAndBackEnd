package com.zorba.model;

public class StudentSir {
	private String name;
	private String address;
	private int mobile;
	private String email;
	private String password;
	private String cPassword;
	
	public StudentSir(String name, String address, int mobile, String email, String password, String cPassword) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.cPassword = cPassword;
	}

	public StudentSir() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	
	
	

}
