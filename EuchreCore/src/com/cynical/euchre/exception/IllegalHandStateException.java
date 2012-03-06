package com.cynical.euchre.exception;

public class IllegalHandStateException extends Exception {

	private static final long serialVersionUID = 8241385307399194936L;
	
	private String message = "";
	
	public IllegalHandStateException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
