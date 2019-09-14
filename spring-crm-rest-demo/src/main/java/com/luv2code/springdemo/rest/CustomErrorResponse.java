package com.luv2code.springdemo.rest;

public class CustomErrorResponse {
	
	private int error;
	private String message;
	private long timeStamp;
	public CustomErrorResponse(int error, String message, long timeStamp) {
		super();
		this.error = error;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public CustomErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
