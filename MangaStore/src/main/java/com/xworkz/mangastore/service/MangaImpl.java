package com.xworkz.mangastore.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.mangastore.MangaStore;
import com.xworkz.mangastore.dto.MangaDto;

public class MangaImpl implements MangaService   {
	MangaDto manga=new MangaDto();
	MangaStore man=new MangaStore();
	@Override
	public boolean save(MangaDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MangaDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			System.out.println(violation);
		    
		} else {
			System.out.println("error");
			
		}
		return false;
	}
	@Override
	public boolean DoPost(MangaDto dto)   {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MangaDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			System.out.println(violation);
		    
		} else {
			System.out.println("error");
			
		}
		return false;
	}

}
