package com.xworkz.disel.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguartion  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling getRootConfigClasses  "+this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses  "+this.getClass().getSimpleName());
		
		return new Class[]{SpringConfigaurtion.class};
	}
	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMappings  "+this.getClass().getSimpleName());

		return new String[] {"*.do"};
	}

}
