package br.com.ggdio.superj.exception;

/**
 * Exception responsible for indicating that
 * an entity already exists on the database
 * @author Guilherme Dio
 *
 */
public class EntityExistsException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public EntityExistsException() {
		this(null);
	}
	
	public EntityExistsException(String msg) {
		this(msg,null);
	}
	
	public EntityExistsException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
}
