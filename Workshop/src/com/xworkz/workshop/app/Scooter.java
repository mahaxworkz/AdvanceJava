package com.xworkz.workshop.app;

import org.springframework.stereotype.Component;

@Component("Scooter")
public class Scooter implements WorkshopForTwoWheeler {

	@Override
	public void ChargeForTwoWheelers() {
		 System.out.println("For car - 1500");
		
	}

}
