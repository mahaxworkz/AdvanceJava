package com.xworkz.taxi1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.taxi1")
public class TaxiConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		
		LocalEntityManagerFactoryBean emf=new LocalEntityManagerFactoryBean(); 
		emf.setPersistenceUnitName("databaseProperties");
		return emf;
		
		
		
		
	}

}
