package com.xworkz.bars.dbconfiguration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguartion {

	public DBConfiguartion() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource) {
		System.out.println("Calling LocalConnectionFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(dataSource);

		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);
		jpaProperties.put("hibernate.format_sql", true);
		bean.setJpaPropertyMap(jpaProperties);
		return bean;

	}

	@Bean
	public DataSource dataSource() {
		System.out.println("Calling DataSource ");
		DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
		managerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		managerDataSource.setUrl("jdbc:mysql://localhost:3306/xworkzodc");
		managerDataSource.setUsername("root");
		managerDataSource.setPassword("Hanamant123@");
		return managerDataSource;
	}

}
