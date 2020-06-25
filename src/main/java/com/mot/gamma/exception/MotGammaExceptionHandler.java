package com.mot.gamma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mot.gamma.util.ResponseStatus;

@ControllerAdvice
public class MotGammaExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(MotGammaNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFound() {
		ResponseStatus status = new ResponseStatus();
		status.setCode(404);
		status.setMessage("mod gamma Details not found");
		status.setStatus("Resource not found.");
		return new ResponseEntity<Object>(status, HttpStatus.NOT_FOUND);
		
	}
	
}
