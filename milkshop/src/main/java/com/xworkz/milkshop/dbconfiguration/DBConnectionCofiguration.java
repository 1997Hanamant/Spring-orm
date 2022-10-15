package com.xworkz.milkshop.dbconfiguration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConnectionCofiguration {
	public DBConnectionCofiguration() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource source) {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("Getting datasource  from Spring");
		bean.setDataSource(source);

		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);
		jpaProperties.put("hibernate.format_sql", true);
		bean.setJpaPropertyMap(jpaProperties);
		return bean;

	}

	@Bean
	public DataSource dataSource() {
		System.out.println("Running DataSource");
		DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
		managerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		managerDataSource.setUrl("jdbc:mysql://localhost:3306/xworkzodc");
		managerDataSource.setUsername("root");
		managerDataSource.setPassword("Hanamant123@");
		return managerDataSource;

	}
}
