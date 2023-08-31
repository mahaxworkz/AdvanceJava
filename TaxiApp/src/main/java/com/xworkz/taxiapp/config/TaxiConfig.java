package com.xworkz.taxiapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.taxiapp")
public class TaxiConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		
		LocalEntityManagerFactoryBean emf=new LocalEntityManagerFactoryBean(); 
		emf.setPersistenceUnitName("databaseProperties");
		return emf;
		
		
		
		
	}

}
