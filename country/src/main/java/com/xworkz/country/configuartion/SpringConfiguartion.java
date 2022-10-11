package com.xworkz.country.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguartion {

	public SpringConfiguartion() {
		System.out.println("Calling SpringConfiguartion");
	}

//	@Bean
//     public	ViewResolver InternalResourceViewResolver(){	
//    System.out.println("Calling ViewResolver");
//	InternalResourceViewResolver bean=new InternalResourceViewResolver();
//	bean.setViewClass(JstlView.class);
//	bean.setPrefix("/WEB-INF/view/");
//	bean.setSuffix(".jsp");
//	return bean;
//
//}
}