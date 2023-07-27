package com.xworkz.vehicle.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

 
import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.repo.VehicleRepo;
import com.xworkz.vehicle.repo.VehicleRepoImpl;

public class VehicleServiceImpl implements VehicleService {
     VehicleRepo repo= new VehicleRepoImpl();
	@Override
	public boolean save(VehicleDto dto) {
		ValidatorFactory  factory=	Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<VehicleDto >> violation=validator.validate(dto);
		if(violation.isEmpty()) {
			if(dto.getId()>0) {
				if(dto.getLaunchedin()>1500) {
					if(dto.getPower()>=10) {
						return repo.save(dto);
					}
					System.out.println("power invalid");
					return false;
				}
				System.out.println("launchyear invalid");
				return false;
				
			}
			
			System.out.println("id invalid");
			return false;
		}
		System.out.println("dto invalid");
		return false;
	}

	@Override
	public VehicleDto FindByName(String name) {
		if(name!= null) {
			return repo.FindByName(name);
		}
		return null;
	}

	@Override
	public VehicleDto FindByConsumeAndPower(String consume, float power) {
		 if(consume!= null) {
			 if(power>0) {
				 return repo.FindByConsumeAndPower(consume, power);
			 }
		 }
		return null;
	}

	@Override
	public boolean UpdateTypeByName(String type, String name) {
		 if(type!= null) {
			 if(name != null) {
				 return repo.UpdateTypeByName(type, name);
			 }
			 System.out.println("name invalid");
			 return false;
		 }
		 System.out.println("type invalid");
		return false;
	}

	@Override
	public boolean UpdateLaunchedAndPowerbyId(float power, int launch, int id) {
		 if(power>0) {
			 if(id>0) {
				 if(launch>1500) {
					return repo.UpdateLaunchedAndPowerbyId(power, launch, id);
				 }
				 System.out.println("launch year invalid");
				 return false;
			 }
			 System.out.println(" id invalid");
			 return false;
		 }
		 System.out.println(" power invalid");
		  
		return false;
	}

	@Override
	public boolean deletebylaunch(int launch) {
		 if(launch>1500) {
			 return repo.deletebylaunch(launch);
		 }
		 System.out.println(" launch year invalid");
		return false;
	}

}
