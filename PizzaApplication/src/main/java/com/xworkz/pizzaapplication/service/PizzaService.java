package com.xworkz.pizzaapplication.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

 
import com.xworkz.pizzaapplication.dto.PizzaDto;
import com.xworkz.pizzaapplication.repo.PizzaRepo;
import com.xworkz.pizzaapplication.repo.RepoImpl;

public class PizzaService implements PizzaSer {
    PizzaRepo rep =new RepoImpl();
	@Override
	public boolean save(PizzaDto dto) throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PizzaDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			System.out.println( "no  violation");
			boolean saving = rep.save(dto);
			System.out.println(saving);
		} else {
			System.out.println("error");
			
		}
		return false;
	}
	
	 
	}
	