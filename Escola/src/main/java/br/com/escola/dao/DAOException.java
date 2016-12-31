package br.com.escola.dao;

/**
 * Exceção de DAO
 */
public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 7684834005920833498L;

	public DAOException() {
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}
}
