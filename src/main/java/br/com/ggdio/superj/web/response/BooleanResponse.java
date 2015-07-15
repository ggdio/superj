package br.com.ggdio.superj.web.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Object for http boolean responses encapsulation
 * @author Guilherme Dio
 *
 */
@XmlRootElement
public class BooleanResponse extends HttpResponse implements Serializable{
	
	private static final long serialVersionUID = 685457297830043898L;
	
	private boolean info;
	
	public BooleanResponse() {
		
	}
	
	public BooleanResponse(String message,boolean info) {
		super(message);
		this.info = info;
	}

	public boolean getInfo() {
		return info;
	}

	public void setInfo(boolean info) {
		this.info = info;
	}
	
}
