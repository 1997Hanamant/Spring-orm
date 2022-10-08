package com.xworkz.songsandfood.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguartion extends AbstractAnnotationConfigDispatcherServletInitializer implements WebApplicationInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling  getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling  getServletConfigClasses");
		return new Class[] {SpringConfiguartion.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling  getServletMappings");
		return new String[] {"*.do"};
	}

}
