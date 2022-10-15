package com.xworkz.milkshop.configuartion;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{
	private String[] servletMappings= {"/"};
	private Class[] servletConfigClasses= {SpringConfiguartion.class};
	

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created"+this.getClass().getSimpleName());
		return servletConfigClasses ;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created"+this.getClass().getSimpleName());
		return servletMappings;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling");
		configurer.enable();
	}

}

