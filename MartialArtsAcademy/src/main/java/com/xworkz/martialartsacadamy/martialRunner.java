package com.xworkz.martialartsacadamy;

import java.util.List;

 
import com.xworkz.martialartsacadamy.dto.MartialDto;
import com.xworkz.martialartsacadamy.service.MartialService;
import com.xworkz.martialartsacadamy.service.ServiceImpl;

public class martialRunner {

	public static void main(String[] args) {
		 MartialDto dto2 = new MartialDto(3, "kAcademy", 9, "mixedmartialarts", "anny", 25000);
		 
		 MartialService service = new ServiceImpl();
		 
		// service.saving(dto2);
		// service.FindById(1);
		// service.FindByName("'kAcademy'");
		// service.updatebyId("mark", 3);
		service.UpdatebynameAndId("'annyAcademy'", 2, 32000);
		 //service.deleteById(3);
		// List<MartialDto> read= service.readAll();
		// read.forEach((i)-> {System.out.println(i);});
		
		 

	}

}
