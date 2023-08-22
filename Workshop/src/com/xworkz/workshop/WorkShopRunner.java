package com.xworkz.workshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.workshop.app.Service;
import com.xworkz.workshop.config.WorkshopConfig;

public class WorkShopRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext con  =  new AnnotationConfigApplicationContext(WorkshopConfig.class);
		Service serve= con.getBean(Service.class);
		
		serve.gettingService();

	}

}
