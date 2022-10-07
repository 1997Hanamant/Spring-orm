package com.xworkz.songsandfood.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguartion {
	
	public SpringConfiguartion() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

}
