package com.xworkz.toyfactory.service;

import java.util.List;

import com.xworkz.toyfactory.dto.ToyFactorydto;
import com.xworkz.toyfactory.repo.ToyRepo;
import com.xworkz.toyfactory.repo.ToyfactoryRepoImpl;

public class TotserviceImpl implements Toyservice {
      
	 ToyRepo repo= new ToyfactoryRepoImpl();
	public boolean saving(ToyFactorydto dto) {
		 if(dto != null) {
			 if(dto.getId()>0) {
					if(dto.getFactoryName()!= null) {
						if(dto.getOwner()!=null) {
							if(dto.getProfit()>30.0) {
								
								if(dto.getYear()>1900) {
									
									repo.saving(dto);
									return true;
									
								}
								System.out.println("  year is not valid");
								return false;
								}
								System.out.println(" profit is not valid");
								return false;
							}
							
						 
							System.out.println(" ownername is not valid");
							return false;	 
					}
					System.out.println(" name is not valid");
					return false;
				}
				System.out.println("id is not valid");
				return false;
			}
			 System.out.println("dto is not valid");
			return false;
		
	}
	 
	 
	@Override
	public boolean Updateprofitbyname(String owner, int profit) {
		 if(owner!=null) {
			 if(profit>30) {
				 return repo.Updateprofitbyname(owner, profit);
			 }
			 System.out.println("profit is not valid");
			 return false;
		 }
		 System.out.println(" ownername is not valid");
		return false;
	}
	 
	 
	 
	public List<ToyFactorydto> readAll() {
		
		return repo.readAll();
	}
	@Override
	public ToyFactorydto FindByname(String owner) {
		// TODO Auto-generated method stub
		return repo.FindByName(owner);
	}
	@Override
	public ToyFactorydto FindByid(int id) {
		
		return repo.FindByid(id);
	}
	@Override
	public boolean updateFactorybyNameandid(String owner, int id, String factory) {
		 
		return repo.updateFactorybyNameandid(owner, id, factory);
	}
	@Override
	public boolean deleteByid(int id) {
		 
		return repo.deleteByid(id);
	}
	
	
	
	
	
	
	
	
	

}
