package com.xworkz.linkedin;

 

import com.xworkz.linkedin.dto.LinkDto;
import com.xworkz.linkedin.service.LinkService;
import com.xworkz.linkedin.service.ServiceImp;

public class Runner {
	 

	public static void main(String[] args) {
		 
		
		 LinkDto link = new   LinkDto();
		 LinkService service = new ServiceImp();
		 link.setId(13);
		 link.setAge(34);
		 link.setArea("theni");
		 link.setAreeOfInterest("R");
		 link.setConnection(132);
		// link.setDOB( 12300000000L);
		 link.setEmail("ram@gmail.com");
		 link.setExperience(1);
		 link.setFathername("Shellaiya"); 
		 link.setJobsites("Chennai");
		 link.setName("Ram");
		 link.setPhoneno( 24464523);
		 link.setPresentation(4);
		 link.setSearchingjob("data Scientist");
		 link.setSkills("ruby");
		 link.setQualification("B.E(CSE)");
		
		  
		 
		 
		service.ValidateAndSave(link);
		// service.ValidateUpdate(4, "dhanu@gmail.com");
		// service.ValidateRead("dhanushya@gmail.com");
		// service.ValidateReadall(link);
		 //service.Delete(3, "varmagmail.com");
		 //service.ReadById(7, " kathir@gmail.com");

	}

}
