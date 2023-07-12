package com.xworkz.wenzio.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

 
import com.xworkz.wenzio.dto.wenzioDto;
import com.xworkz.wenzio.repository.RepoImpl;
import com.xworkz.wenzio.repository.Wenrepo;

public class WenserviceImpl implements WenService  {
	
	Wenrepo repo =new  RepoImpl();

	@Override
	public boolean saving(wenzioDto dto) throws Exception {
		ValidatorFactory factory=	 Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation< wenzioDto>> violation = validator.validate(dto);
		if (violation.isEmpty()) {
			System.out.println( "no  violation");
			boolean saving=repo.save(dto);
			System.out.println(saving);
		} else {
			System.out.println("error");
			
		}
		
		
		
		return false;
	}

}
