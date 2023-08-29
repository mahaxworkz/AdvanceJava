package com.xworkz.fruitshop.service;

 
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.fruitshop.dto.FruitShopDto;
import com.xworkz.fruitshop.repo.FruitShopRepo;
@Component
public class FruitServiceImpl implements FruitService {
	
	@Autowired
	private FruitShopRepo repo;

	@Override
	public boolean save(FruitShopDto dto) {
		 
		if(!checkExists(dto.getShopName())) {
			 
		 
		 if(dto != null) {
			 if(dto.getId()>0) {
				 if(dto.getNoOfBranches()>2) {
					 if(dto.getOwnernName().length()>3) {
						 if(dto.getReview()!= null) {
							 if(dto.getShopName()!= null) {
								 return repo.save(dto);
							 }
							 System.out.println(" name is null");
								return false;
						 }
						 System.out.println("no one reviewed");
							return false;
					 }
					 System.out.println("name not valid");
						return false;
				 }
				 System.out.println("branches count is wrong");
					return false;
			 }
			 System.out.println("id invalid");
				return false; 
		 }
		 System.out.println("dto is null");
		return false;
		}
		System.out.println("dto is already exist");
		return false;}

	@Override
	public List<FruitShopDto> FindByName(String name) {
		 
			 List<FruitShopDto> list= repo.FindByName(name);
			 if(list != null) {
				 System.out.println("given dto is not null from FindByName");
				 return list;
			 }
			 System.out.println("dto service");
			 return null;
		 
	}

	@Override
	public boolean checkExists(String name) {
		 
		 if(FindByName( name)!= null) {
			 System.out.println("given dto is not null from checkExists");
			 
			return true; 
		 }
		 System.out.println("dto0 service");
		return false;
		
		 
	}

	 
		 
		 
	

	 
		 

	 
}
