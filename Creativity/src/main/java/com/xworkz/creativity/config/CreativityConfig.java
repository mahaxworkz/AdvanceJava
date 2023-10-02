package com.xworkz.creativity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class CreativityConfig {
	
	
	@Bean
	public LocalEntityManagerFactoryBean getEbtity() {
		LocalEntityManagerFactoryBean lemf= new LocalEntityManagerFactoryBean();
		lemf.setPersistenceUnitName("databaseProperties");
		return lemf;
	}

}
