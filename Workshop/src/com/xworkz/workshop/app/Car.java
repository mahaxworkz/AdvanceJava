package com.xworkz.workshop.app;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car implements WorkshopForFourWheelers {

	@Override
	public void getCostForFourWheeler() {
		 System.out.println("For car - 2000");
		
	}

}
