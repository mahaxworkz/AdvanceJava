package com.xworkz.foodapp.app;

import org.springframework.stereotype.Component;

@Component
public class EatClub implements FoodAppInterface {

	@Override
	public void GetRating() {
		 System.out.println("EatClub - 4.2");

	}

}
