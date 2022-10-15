package com.xworkz.milkshop.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguartion {

	public SpringConfiguartion() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("calling resolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
}
