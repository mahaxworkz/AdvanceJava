package com.xworkz.toyfactory.service;

import java.util.List;

import com.xworkz.toyfactory.dto.ToyFactorydto;

public interface Toyservice {
	public boolean saving(ToyFactorydto dto);
	public  ToyFactorydto FindByname(String owner) ;
	public ToyFactorydto FindByid( int id);
	public boolean Updateprofitbyname(String owner,int profit);
	public boolean updateFactorybyNameandid(String owner,int id,String factory);
	 
	public boolean deleteByid(int id);
	public List<ToyFactorydto> readAll();

}
