package com.xworkz.users.dbconfiguartion;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConncetion {

	public DBConncetion() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource source) {
		System.out.println("Calling LocalContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(source);
		
		Map<String , Object> jpaProperties=new HashMap<String , Object>();
		jpaProperties.put("Hibernate.show_sql", true);
		jpaProperties.put("Hibernate.format_sql", true);
		bean.setJpaPropertyMap(jpaProperties);
		return bean;
	}
	@Bean
	public DataSource dataSource() {
		System.out.println("Calling DataSource ");
		DriverManagerDataSource managerDataSource=new DriverManagerDataSource();
		managerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		managerDataSource.setUrl("jdbc:mysql://localhost:3306/xworkzodc");
		managerDataSource.setUsername("root");
		managerDataSource.setPassword("Hanamant123@");
		return managerDataSource;
		
	}

}

