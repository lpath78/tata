package com.tati.tata.model.exception;


/**
 * BusinessException.
 * Classe catchant les erreures des vues, des controllers et des facades
 * @author valery.locascio
 *
 */
@SuppressWarnings("serial")
public class BusinessException extends Exception {

	public BusinessException() {
	
	}

	public BusinessException(String message) {
		super(message);
		
	}

	public BusinessException(Throwable cause) {
		super(cause);
	
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

}
