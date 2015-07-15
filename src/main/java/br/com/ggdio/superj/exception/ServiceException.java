package br.com.ggdio.superj.exception;

/**
 * Exception for service layer
 * @author Guilherme Dio
 *
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(String msg) {
		super(msg);
	}
	
	public ServiceException(Throwable cause) {
		super(cause);
	}
	
	public ServiceException(String msg, Throwable cause) {
		super(msg,cause);
	}

}
