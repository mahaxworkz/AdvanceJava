package com.xworkz.pizzaapplication.repo;

import com.xworkz.pizzaapplication.dto.PizzaDto;

public interface PizzaRepo {
	public boolean save( PizzaDto dto) throws Exception;
}
