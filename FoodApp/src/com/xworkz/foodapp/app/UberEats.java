package com.xworkz.foodapp.app;

import org.springframework.stereotype.Component;

@Component
public class UberEats implements FoodAppInterface {

	@Override
	public void GetRating() {
		 System.out.println(" UberEats - 4.2");

	}

}
