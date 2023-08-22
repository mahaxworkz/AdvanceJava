package com.xworkz.foodapp.app;

import org.springframework.stereotype.Component;

@Component
public class Swiggy implements FoodAppInterface {

	@Override
	public void GetRating() {
		 System.out.println("Swiggy - 4.7");

	}

}
