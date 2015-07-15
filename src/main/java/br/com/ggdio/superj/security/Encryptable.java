package br.com.ggdio.superj.security;

/**
 * Interface made to be used by entities 
 * with encryptable fields
 * @author Guilherme Dio
 *
 */
public interface Encryptable {
	
	public void enableEncryption();
	
	public void disableEncryption();

	public boolean shouldEncrypt();
	
}
