package com.automationframework.service.api;

import com.automationframework.model.request.Loginrequest;

import io.restassured.response.Response;

public class AuthService extends Baseservice {
	
	private String BASEPATH="api/auth/";
	
	
	public Response login(Loginrequest payload) {
		return post(payload, BASEPATH +"login");
	}
	
	
	public Response resetPassword(Loginrequest payload) {
		return post(payload, BASEPATH+"reset-password");
	}

}
