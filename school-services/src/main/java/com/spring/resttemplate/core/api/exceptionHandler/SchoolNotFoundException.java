package com.spring.resttemplate.core.api.exceptionHandler;

public class SchoolNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6756243798659647969L;

	public SchoolNotFoundException() {
		super();
	}

	public SchoolNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SchoolNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SchoolNotFoundException(String message) {
		super(message);
	}

	public SchoolNotFoundException(Throwable cause) {
		super(cause);
	}
}
