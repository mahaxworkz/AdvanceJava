package com.xworkz.vehicle.repo;

import com.xworkz.vehicle.dto.VehicleDto;

public interface VehicleRepo {
	
	public boolean save(VehicleDto dto);
	
public VehicleDto FindByName(String name);
public VehicleDto FindByConsumeAndPower(String consume,float power);
public boolean UpdateTypeByName(String type,String name);
public boolean UpdateLaunchedAndPowerbyId (float power,int launch,int id) ;
public boolean  deletebylaunch(int launch );


}
