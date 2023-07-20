package com.xworkz.forest.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.forest.dto.ForestDto;

public class Forsetconfig {
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory  getSessionFactory() {
		
		if(sessionFactory == null) {
			
			Configuration config = new Configuration();
			Properties props= new Properties();
			props.put(Environment.URL,"jdbc:mysql://localhost:3306/event");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "Xworkzodc@123");
			props.put(Environment.SHOW_SQL, "true");
			//props.put(Environment.HBM2DDL_AUTO, "create");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");
			
			
			config.setProperties(props);
			config.addAnnotatedClass(ForestDto.class);
			ServiceRegistry service= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory = config.buildSessionFactory(service);
			return sessionFactory;
			
		}
		
		
		
		
		return sessionFactory;
		
	}

}
