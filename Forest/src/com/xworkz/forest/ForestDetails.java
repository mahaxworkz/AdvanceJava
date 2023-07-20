package com.xworkz.forest;

import com.xworkz.forest.dto.ForestDto;
import com.xworkz.forest.service.ForestService;
import com.xworkz.forest.service.ServiceImpl;

public class ForestDetails {

	public static void main(String[] args) {
		ForestDto dto = new ForestDto();
	ForestDto dto01= new ForestDto(1, "mudhumalai", "TN", "rainforest", 2325);
		 ForestDto dto1= new ForestDto(4, "sundharbans", "West Bengal", "mangrove", 5342);
		 ForestService service= new ServiceImpl();
		 
	  //boolean save=service.save(dto1);
	 // System.out.println(save);
	//	 ForestDto read= service.Reading(1);
	//	 System.out.println(read);
		 
//		 boolean update= service.UpdateByID(2, "mysoreForest");
//		 System.out.println(update);
	  boolean delete = service.Delete(4);
	  System.out.println(delete);
	}

}
