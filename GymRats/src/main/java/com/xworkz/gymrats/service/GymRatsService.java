package com.xworkz.gymrats.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public interface GymRatsService {
	
	public boolean GetdetailsOfGym(String name, String title , Integer NoOftitles,  Boolean adSuits ,Model model ) ;
		 

}
