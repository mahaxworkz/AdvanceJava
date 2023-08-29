package com.xworkz.fruitshop.repo;

import java.util.List;

import com.xworkz.fruitshop.dto.FruitShopDto;

public interface FruitShopRepo {
	
	public boolean save(FruitShopDto dto);
	
	public List<FruitShopDto> FindByName (String name);
//	public  FruitShopDto FindByName1(String name);
	 

}
