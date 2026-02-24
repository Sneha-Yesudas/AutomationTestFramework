package com.automationframework.model.request;

public class Loginrequest {
	
	public String username;
	public String password;
	
	public Loginrequest(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	
	@Override
	public String toString() {
		return "Loginrequest [username=" + username + ", password=" + password + "]";
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
