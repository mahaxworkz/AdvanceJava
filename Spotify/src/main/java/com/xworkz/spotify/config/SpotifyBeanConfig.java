package com.xworkz.spotify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration 
public class SpotifyBeanConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean getEntity() {
		LocalEntityManagerFactoryBean  lemf= new LocalEntityManagerFactoryBean();
		lemf.setPersistenceUnitName("databaseProperties");
		return lemf;
	}

}
