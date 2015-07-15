package br.com.ggdio.superj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the value must be randomic generated on insert
 * @author Guilherme Dio
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Random {

	/**
	 * Maintain the value when inserting a new row
	 * <p> Useful when using {@link Encrypt}
	 * @return
	 */
	boolean mantainOnInsert() default false;
	
	/**
	 * Minimum string length
	 * @return
	 */
	int minLength() default 10;
	
	/**
	 * Maximum string length
	 */
	int maxLength() default 15;
	
	/**
	 * Number of upper case characters
	 * @return
	 */
	int upperCaseChars() default 5;
	
	/**
	 * Number of numeric characters
	 * @return
	 */
	int numericChars() default 3;
	
	/**
	 * Number of special characters
	 * @return
	 */
	int specialChars() default 4;
	
}
