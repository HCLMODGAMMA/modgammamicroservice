package com.mot.gamma.entiry;

public class Login {
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String userName;
	private String password;
	
	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
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
