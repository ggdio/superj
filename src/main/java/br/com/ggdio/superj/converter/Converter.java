package br.com.ggdio.superj.converter;

/**
 * Interface for object conversion
 * @author Guilherme Dio
 * @param <F> From(Original type)
 * @param <T> To(New type)
 */
public interface Converter<F,T> {
	
	public T convertTo(F objeto);
    public F convertFrom(T objeto);
	
}
