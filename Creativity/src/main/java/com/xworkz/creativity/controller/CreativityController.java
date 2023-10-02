package com.xworkz.creativity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.service.CreativeService;

@Controller
public class CreativityController {
	
	@Autowired
	private CreativeService service;
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String SaveDetails(CreativityDto dto ,Model model) {
		
		boolean Save= service.save(dto);
		if(Save) {
			model.addAttribute("saved", "Saved sucessfully");
		}
		return "index";
		
	}
	

}
