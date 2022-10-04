package com.xworkz.disel.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfigaurtion {

	public SpringConfigaurtion() {
		System.out.println("SpringConfigaurtion is created" + this.getClass().getSimpleName());
	}

}
