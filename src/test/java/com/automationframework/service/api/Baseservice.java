package com.automationframework.service.api;

import static io.restassured.RestAssured.*;

import com.automationframework.model.request.Loginrequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseservice {
	
	private  final static String  BASEURI="http://64.227.160.186:8080/";
	RequestSpecification requestSpecification;

	public Baseservice() {
		super();
		requestSpecification=given().baseUri(BASEURI);
	}
	
	
	public Response post(Loginrequest payload ,String endpoint) {
		
		return requestSpecification.body(payload).contentType(ContentType.JSON).post(endpoint);
	}
	
	
	
	

}
