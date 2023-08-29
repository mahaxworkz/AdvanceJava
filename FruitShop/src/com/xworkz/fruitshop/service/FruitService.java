package com.xworkz.fruitshop.service;

import java.util.List;

import com.xworkz.fruitshop.dto.FruitShopDto;

public interface FruitService {
public boolean save(FruitShopDto dto);
public List<FruitShopDto> FindByName (String name);

	public  boolean checkExists(String name);
//	public  FruitShopDto FindByName1(String name);

}
