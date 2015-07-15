package br.com.ggdio.superj.web.common;

/**
 * Webservice client interface 
 * @author Guilherme Dio
 *
 */
public interface Client {
	
	/**
	 * Get target address
	 */
	public String getAddress();
	
	/**
	 * Set target address
	 * @param address
	 */
	public void setAddress(String address);
	
}
