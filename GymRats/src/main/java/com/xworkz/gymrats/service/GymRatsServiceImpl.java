package com.xworkz.gymrats.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class GymRatsServiceImpl implements GymRatsService {

	@Override
//	public boolean GetdetailsOfGym(String name, String title, Integer NoOftitles, Boolean adSuits, Model model) {
//		 if(name!=null && title !=null  ) {
//			 
//		   if(name.length()>3 && !name.isEmpty()) {
//				 if( title.length()>3 && !title.isEmpty()) {
//					 if(NoOftitles>3) {
//						if( adSuits ) {
//							System.out.println("valid");
//							return true;
//						}
//						else {
//						model.addAttribute("IsAdValid", "No ad Shoots");
//						return false;}
//					 }
//					 {
//					 model.addAttribute("IsawardsValid", " minimum 3 titles needed");
//					 return false;
//					 }
//				 }
//				 else{
//					 model.addAttribute("IstitleValid", "title is not valid");
//				 
//				 return false; 
//				 }
//			 }
//		   else {
//			 model.addAttribute("IsnameValid", " name is not valid");
//			 return false; 
//		   }
//		 }
//		 System.out.println("null value");
//		return false;
//	}
	 
		public boolean GetdetailsOfGym(String name, String title, Integer NoOftitles, Boolean adSuits, Model model) {
		    boolean valid = true; // Assume the input is valid by default
		    
		    if (name != null && title != null) {
		        if (name.length() <= 3 || name.isEmpty()) {
		            model.addAttribute("IsnameValid", "name is not valid");
		            valid = false; // Mark the input as invalid
		        }
		        
		        if (title.length() <= 3 || title.isEmpty()) {
		            model.addAttribute("IstitleValid", "title is not valid");
		            valid = false; // Mark the input as invalid
		        }
		        
		        if (NoOftitles <= 3) {
		            model.addAttribute("IsawardsValid", "minimum 3 titles needed");
		            valid = false; // Mark the input as invalid
		        }
		        
		        if (!adSuits) {
		            model.addAttribute("IsAdValid", "No ad Shoots");
		            valid = false; // Mark the input as invalid
		        }
		    } else {
		        System.out.println("null value");
		        valid = false; // Mark the input as invalid
		    }

		    if (!valid) {
		        System.out.println("false scenario: " + model.asMap());
		    }
		    
		    return valid;
		}


}
