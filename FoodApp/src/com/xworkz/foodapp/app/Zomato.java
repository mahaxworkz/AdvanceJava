package com.xworkz.foodapp.app;

import org.springframework.stereotype.Component;
@Component
public class Zomato implements FoodAppInterface {


	public void GetRating() {
		 System.out.println(" Zomato - 4.4");
	}

}
