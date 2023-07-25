package com.xworkz.toyfactory.repo;

import java.util.List;

import com.xworkz.toyfactory.dto.ToyFactorydto;

public interface ToyRepo {
	public boolean saving(ToyFactorydto dto);
	public ToyFactorydto FindByName(String owner) ;
	public ToyFactorydto FindByid( int id);
	public boolean Updateprofitbyname(String owner,int profit);
	public boolean updateFactorybyNameandid(String owner,int id,String factory);
	 
	public boolean deleteByid(int id);
	public List<ToyFactorydto> readAll();
	

}
