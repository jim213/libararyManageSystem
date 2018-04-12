package com.jim.library.exception;

@SuppressWarnings("serial")
public class BmsException extends Exception {
	
	//异常信息
	public String message;

	public BmsException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
