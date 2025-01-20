package com.in28minutes.rest.webserives.restful_web_services.helloworld.beans;

public class HelloWorldBean {
	
	private String message;

	
	public HelloWorldBean() {}
	
	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	

}
