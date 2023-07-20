package com.xworkz.toyfactory.repo;

import java.util.List;

import com.xworkz.toyfactory.dto.ToyFactorydto;

public interface ToyRepo {
	public boolean saving(ToyFactorydto dto);
	public ToyFactorydto FindByName(String owner) ;
	public ToyFactorydto FindByyear( int year);
	public boolean Updateprofitbyname(String owner,int profit);
	public boolean updateFactoryAndProfitbyName(String owner,int profit,String factory);
	public boolean updateFactoryAndProfitAndOwnerbyYear(String owner,int profit,String factory,int year);
	public boolean deleteByname(String owner);
	public List<ToyFactorydto> readAll();
	

}
