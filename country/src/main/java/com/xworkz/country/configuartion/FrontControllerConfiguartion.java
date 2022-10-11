package com.xworkz.country.configuartion;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguartion extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses");
		return new  Class[] {SpringConfiguartion.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMappings");
		return new  String[]{"*.do"};
	}

}
