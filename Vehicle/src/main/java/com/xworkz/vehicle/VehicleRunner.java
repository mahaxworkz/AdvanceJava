package com.xworkz.vehicle;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;
import com.xworkz.vehicle.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		
		
		VehicleDto dto = new VehicleDto(5, null, "four wheeler",  "diesel", 19, 1700);
		
		VehicleService service= new VehicleServiceImpl();
		
		
		service.save(dto);

		//service.FindByName("auto");
		//service.FindByConsumeAndPower("diesel",450 );
		//service.UpdateTypeByName("4 wheeler", "bus");
		//service.UpdateLaunchedAndPowerbyId(140, 1989, 2);
		//service.deletebylaunch(1900);
		
		
		

	}

}
