package br.com.ggdio.superj.web.path;

/**
 * REST paths resolver
 * @author Guilherme Dio
 *
 */
public class BasicRestPathResolver implements PathResolver {

	@Override
	public String resolveCreate(){
		return "/";
	}
	
	@Override
	public String resolveUpdate(Long id){
		return "/" + id;
	}
	
	@Override
	public String resolveDelete(Long id){
		return "/" + id;
	}
	
	@Override
	public String resolveGet() {
		return "/";
	}
	
	@Override
	public String resolveGet(Long id){
		return "/" + id;
	}
	
	@Override
	public String resolveList(){
		return "/";
	}
	
}