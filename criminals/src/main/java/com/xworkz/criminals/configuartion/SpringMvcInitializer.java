package com.xworkz.criminals.configuartion;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.criminals.dbconfiguartion.DBConncetion;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private String[] servletMappings = { "/" };
	private Class[] servletConfigClasses = { SpringConfiguartion.class, DBConncetion.class };

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
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("Creating file upload customizer");
		File uploadDirectory=new File("F:/temp-files");
		MultipartConfigElement multipartConfigElement=new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				100000000,100000000*2,100000000/2);
		registration.setMultipartConfig(multipartConfigElement);

	}

}