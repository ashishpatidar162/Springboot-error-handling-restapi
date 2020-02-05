package com.springboot.exception.handling.apierror;

public class ApiValidationError extends ApiSubError  {
	
	private String object;
	private String message;
	private Object rejectedValue;
	private String field;
	
	
	ApiValidationError(String object, String message) {
	
		this.object = object;
		this.message = message;
	}
	
	
	
}
