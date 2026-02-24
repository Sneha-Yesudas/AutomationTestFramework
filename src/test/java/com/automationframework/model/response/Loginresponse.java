package com.automationframework.model.response;

import java.util.List;

public class Loginresponse {
	
	private String token;
	private String type;
	private int id;
	private String username;
	private String email;
	private List<String> roles;
	
	public Loginresponse() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Loginresponse(String token, String type, int id, String username, String email, List<String> roles) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Loginresponse [tokenLogin=" + token + ", type=" + type + ", id=" + id + ", username=" + username
				+ ", email=" + email + ", roles=" + roles + "]";
	}




	public String gettoken() {
		return token;
	}
	public void setTokenLogin(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}	
	


}
