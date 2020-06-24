package com.mot.gamma.exception;

import org.springframework.http.HttpStatus;

public class MotGammaException extends Exception {

	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorMessage;
	private HttpStatus httpStatus;
	
	public MotGammaException(int errorCode, String errorMessage, HttpStatus httpStatus) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	
}
