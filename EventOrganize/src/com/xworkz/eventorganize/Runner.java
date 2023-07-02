package com.xworkz.eventorganize;

import com.xworkz.eventorganize.dto.Organizedto;
import com.xworkz.eventorganize.service.EventService;
import com.xworkz.eventorganize.service.EventServiceImp;

public class Runner {

	public static void main(String[] args) {
		Organizedto dto = new Organizedto();
		EventService service = new EventServiceImp();
		dto.setId(3);
		dto.setAwards(25);
		dto.setCountry("india");
		dto.setEmail("Wizcraft@gmail.com");
		dto.setEmployees(14000);
		dto.setLocation("bangalore");
		dto.setMobileno("3689926");
		dto.setName("Wizcraft");
		dto.setNoOfBranches(50);
		dto.setOrganizingEvents(233);
		dto.setOwner("Venket varma");
		dto.setProfit(46);
		dto.setRank(7);
		dto.setReview("good");
		dto.setState(" karnataka");
		service.save(dto);
		 
		service.Update("vikram","vik@gmail.com");
		
		
		 service.Updating(dto, 2, 2);
	 
        service.UpdateMail(dto, 1);
	 
 
		service.UpdateDto(dto, 3);
		
	}
	

}
