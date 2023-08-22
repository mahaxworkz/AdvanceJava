package com.xworkz.foodapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.foodapp.app.EatClub;
import com.xworkz.foodapp.app.FoodAppInterface;
import com.xworkz.foodapp.app.Swiggy;
import com.xworkz.foodapp.app.UberEats;
import com.xworkz.foodapp.app.Zomato;
import com.xworkz.foodapp.app.Zoop;
import com.xworkz.foodapp.config.FoodConfig;

public class FoodAppRunner {

	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(FoodConfig.class);
		
		FoodAppInterface app1= con.getBean(EatClub.class);
		app1.GetRating();

		FoodAppInterface app2= con.getBean(Swiggy.class);
		app2.GetRating();

		FoodAppInterface app3= con.getBean( UberEats.class);
		app3.GetRating();

		FoodAppInterface app4= con.getBean( Zomato.class);
		app4.GetRating();

		FoodAppInterface app5= con.getBean(Zoop.class);
		app5.GetRating();

	}

}
