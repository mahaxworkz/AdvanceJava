package com.xworkz.vehicle.service;

import com.xworkz.vehicle.dto.VehicleDto;

public interface VehicleService {
	public boolean save(VehicleDto dto);
	
	public VehicleDto FindByName(String name);
	public VehicleDto FindByConsumeAndPower(String consume,float power);
	public boolean UpdateTypeByName(String type,String name);
	public boolean UpdateLaunchedAndPowerbyId (float power,int launch,int id) ;
	public boolean  deletebylaunch(int launch );

}
