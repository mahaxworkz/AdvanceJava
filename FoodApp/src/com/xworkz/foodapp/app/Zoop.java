package com.xworkz.foodapp.app;

import org.springframework.stereotype.Component;

@Component
public class Zoop implements FoodAppInterface {

	@Override
	public void GetRating() {
		 System.out.println(" Zoop - 4.2");

	}

}
