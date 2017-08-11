/**
 * 
 */
package br.com.simpleapp.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * @author Lincolwn Martins
 *
 */
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppWebConfig.class, JPAConfiguration.class};
		}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	protected void customizeRegistration(Dynamic registration)
	{
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}
}
