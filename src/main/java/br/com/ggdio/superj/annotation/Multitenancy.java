package br.com.ggdio.superj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.hibernate.annotations.Filter;

import br.com.ggdio.superj.hibernate.MultitenancyStrategy;

/**
 * Specifies that the class is an multitenant entity. This annotation is applied to the
 * entity class.
 * @author Guilherme Dio
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Multitenancy {
	
	/**
	 * (Optional) The multitenancy strategy to be used
	 * <p>default: MultitenancyStrategy.FILTER
	 */
	MultitenancyStrategy value() default MultitenancyStrategy.FILTER;
	
	/**
	 * (Optional) The tenant identifier field name.
	 * This name is used to refer to the field in queries.
	 * <p>default: tenantId
	 */
	String discriminatorField() default "tenantId";
	
	/**
	 * If MultitenancyStrategy.FILTER strategy is being used, so specify the filtername
	 * (Optional) The {@link Filter} name
	 */
	String filterName() default "";
	
	/**
	 * (Optional) The {@link Filter} parameter name for the tenant ID
	 * <p>default: tenantId
	 */
	String filterParameterName() default "tenantId";
}
