package com.xworkz.criminals.configuartion;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.criminals.dbconfiguartion.DBConncetion;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	
	private String[] servletMappings = {"/"};
	private Class[] servletConfigClasses = {SpringConfiguartion.class, DBConncetion.class };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created" + this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created" + this.getClass().getSimpleName());
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created" + this.getClass().getSimpleName());
		return servletMappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
