package com.xworkz.bookshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class BookConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean getEntity() {
		LocalEntityManagerFactoryBean  lemf= new LocalEntityManagerFactoryBean();
		lemf.setPersistenceUnitName("databaseProperties");
		return lemf;
	}


}
