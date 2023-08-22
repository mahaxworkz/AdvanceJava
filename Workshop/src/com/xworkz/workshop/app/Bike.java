package com.xworkz.workshop.app;

import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike implements WorkshopForTwoWheeler {

	@Override
	public void ChargeForTwoWheelers() {
		 System.out.println("For bike - 1000");
		
	}

}
