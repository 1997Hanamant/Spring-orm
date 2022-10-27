package com.xworkz.users.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguartion {

	public SpringConfiguartion() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Calling ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");

	}

	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println("Calling MultipartResolver,,,,,, ");
		return new StandardServletMultipartResolver();
	}

}
