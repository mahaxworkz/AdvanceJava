package com.xworkz.firstmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class FirstBean {
	@RequestMapping(value = "/open" )
	public String DoLogin(Model model) {
		if(false) model.addAttribute("log",  "login sucessfully");
		else model.addAttribute("log", "Check the email");
		return "Login";
		
	}
	
	@Bean
	 
    public  ViewResolver Paging() {
 return   new	 InternalResourceViewResolver("/WEB-INF/", ".jsp");
    }

	@RequestMapping(value = "/close" )
	public String DoLogout(Model model) {
		if(false) model.addAttribute("logout",  "logout sucessfully");
		else model.addAttribute("logout", "Error");
		return "Logout";
	}
	
	
}
