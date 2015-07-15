package br.com.ggdio.superj.exception;

/**
 * Exception for Controller layer
 * @author Guilherme Dio
 *
 */
public class ControllerException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ControllerException() {
		this(null);
	}
	
	public ControllerException(String msg) {
		this(msg,null);
	}
	
	public ControllerException(String msg, Throwable cause) {
		super(msg,cause);
	}

}
