package com.xworkz.gymrats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.gymrats.service.GymRatsService;

@Controller
public class GymController {
	
	@Autowired
	private GymRatsService service;
	
	@RequestMapping(value = "/gym",method = RequestMethod.POST)
	 public String getDetails( @RequestParam String name,@RequestParam String title ,@RequestParam  Integer NoOftitles,@RequestParam  Boolean adSuits ,Model model ) {
		 
		boolean details= service.GetdetailsOfGym(name, title, NoOftitles, adSuits, model);
		 
		 System.out.println(name + " " +title + " " +NoOftitles + " " +adSuits);
		 
		 if(details) model.addAttribute("valid", "given details are valid");
		 
		 return "HomePage";
		 
	 }
	

}
