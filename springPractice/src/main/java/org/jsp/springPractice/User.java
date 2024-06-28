package org.jsp.springPractice;

public class User {

	private String userName;
	private String password;
	
	public void display() {
		System.out.println("username: "+userName);
		System.out.println("password: "+password);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
