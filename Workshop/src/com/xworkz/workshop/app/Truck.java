package com.xworkz.workshop.app;

import org.springframework.stereotype.Component;

@Component("Truck")
public class Truck implements WorkshopForFourWheelers {

	@Override
	public void getCostForFourWheeler() {
		 System.out.println("For truck - 5000");
		
	}

}
