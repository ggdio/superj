package br.com.ggdio.superj.exception;

/**
 * Exception used to indicate problems on authentication
 * @author Guilherme Dio
 * 
 */
public class AuthenticationException extends Exception {

	private static final long serialVersionUID = 571746798149696954L;

	public AuthenticationException() {
		super();
	}

	public AuthenticationException(String msg) {
		super(msg);
	}

}
