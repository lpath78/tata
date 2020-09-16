package com.tati.tata.model.exception;

/**
 * ConstructionException.
 * Classe catchant les erreures lors d'une creation d'objets
 * @author valery.locascio
 *
 */
@SuppressWarnings("serial")
public class ConstructionException extends Exception {

	public ConstructionException() {
	
	}

	public ConstructionException(String message) {
		super(message);
		
	}

	public ConstructionException(Throwable cause) {
		super(cause);
		
	}

	public ConstructionException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public ConstructionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

}
