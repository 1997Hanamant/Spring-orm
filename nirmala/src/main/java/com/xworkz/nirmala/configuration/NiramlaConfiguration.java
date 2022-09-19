package com.xworkz.nirmala.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
@ComponentScan(basePackages = "com.xworkz.nirmala" )
public class NiramlaConfiguration{
	
	public NiramlaConfiguration() {
		System.out.println(this.getClass().getSimpleName()+"NiramlaConfiguration Created");
	} 
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Calling LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return emf;
		
	}

}
