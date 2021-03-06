package br.com.ggdio.superj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specify elements acess level.
 * <p>Mostly used for webservices security
 * @author Guilherme Dio
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Level {
	
	int value();
	
}
