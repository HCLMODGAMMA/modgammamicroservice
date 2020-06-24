package com.mot.gamma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
 
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MotGammaNotFoundException extends RuntimeException 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MotGammaNotFoundException(){
		
	}

	public MotGammaNotFoundException(String exception) {
        super(exception);
    }
}