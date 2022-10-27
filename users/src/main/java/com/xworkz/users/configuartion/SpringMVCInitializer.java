package com.xworkz.users.configuartion;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.users.dbconfiguartion.DBConncetion;


public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{
	private String[] servletMappings = { "/" };
	private Class[] servletConfigClasses = { SpringConfiguartion.class, DBConncetion.class };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses" );
		// TODO Auto-generated method stub
		return servletConfigClasses ;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		// TODO Auto-generated method stub
		return servletMappings;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Calling  configureDefaultServletHandling");
		configurer.enable(); 
	}
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("Calling customizeRegistration ");
		File uploadDirectory=new File("F:/temp-files");
		MultipartConfigElement configElement=new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				100000000,100000000*2,100000000/2);
		registration.setMultipartConfig(configElement);
		
	}

}
