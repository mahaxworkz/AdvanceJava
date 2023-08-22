package com.xworkz.workshop.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Autowired
	@Qualifier("Car")
	private WorkshopForFourWheelers fourWheelers;
	
	
	
	@Autowired
	@Qualifier("Bike")
	private WorkshopForTwoWheeler twoWheeler;
	
	 public void gettingService() {
		 System.out.println("method 4 wheeler");
		 fourWheelers.getCostForFourWheeler();
		 System.out.println("method 2 wheeler");
		 twoWheeler.ChargeForTwoWheelers();
		 

	}
	
	
	

}
