package br.com.ggdio.superj.exception;

/**
 * Exception for persistence layer
 * @author Guilherme Dio
 *
 */
public class RepositoryException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RepositoryException() {
		this(null);
	}
	
	public RepositoryException(String msg) {
		this(msg,null);
	}
	
	public RepositoryException(String msg, Throwable cause) {
		super(msg,cause);
	}

}
