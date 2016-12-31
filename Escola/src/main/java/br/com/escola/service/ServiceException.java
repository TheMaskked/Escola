package br.com.escola.service;

/**
 * Exceção de Service
 */
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 5957455971165895044L;

	public ServiceException() {
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
}
