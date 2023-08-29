package com.xworkz.fruitshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.fruitshop")
public class FruitConfig {

	
	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		
		LocalEntityManagerFactoryBean emf=new LocalEntityManagerFactoryBean(); 
		emf.setPersistenceUnitName("databaseProperties");
		return emf;
		
		
		
		
	}
	
	
}
