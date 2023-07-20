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
	public ToyFactorydto FindByID(String owner) {
		if( owner!=null) {
			return repo.FindByName(owner);
		}
		return null;
	}
	@Override
	public ToyFactorydto FindByyear( int year) {
		 if(year>1900) {
			 return repo.FindByyear(year);
			 
		 }
		return null;
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
	@Override
	public boolean updateFactoryAndProfitbyName(String owner, int profit, String factory) {
		 if(owner!=null) {
			 if(profit>30) { 
				 if(factory !=null) {
					 return repo.updateFactoryAndProfitbyName(owner, profit, factory);
				 }
				 System.out.println("factory name is not valid");
				 return false;
			 }
			 System.out.println("profit is not valid");
			 return false;
		 }
		 System.out.println(" ownername is not valid");
		return false;
	 
	}
	@Override
	public boolean updateFactoryAndProfitAndOwnerbyYear(String owner, int profit, String factory, int year) {
		if(owner!=null) {
			 if(profit>30) { 
				 if(year>1900) {
				 if(factory !=null) {
					 return repo.updateFactoryAndProfitAndOwnerbyYear(owner, profit, factory, year);
				 }
				 System.out.println("factory name is not valid");
				 return false;
			 }
				 System.out.println( "year is not valid");
			 return false;
				 
			 }
			 System.out.println("profit is not valid");
			 return false;
		 }
		 System.out.println(" ownername is not valid");
		 return false;
	}
	@Override
	public boolean deleteByname(String owner) {
		 if(owner != null) {
			 return repo.deleteByname(owner);
		 }
		return false;
	}
	@Override
	public List<ToyFactorydto> readAll() {
		
		return repo.readAll();
	}
	
	
	
	
	
	
	
	
	

}
