package com.xworkz.linkedin.service;

import java.sql.ResultSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.linkedin.dto.LinkDto;
import com.xworkz.linkedin.repo.LinkRepo;
import com.xworkz.linkedin.repo.LinkRepoImp;

public class ServiceImp  implements LinkService{
	LinkRepo repo =new LinkRepoImp();

	@Override
	public boolean ValidateAndSave(LinkDto dto) {
		
		ValidatorFactory factory=	Validation.buildDefaultValidatorFactory();
		Validator validator=  factory.getValidator();
		Set<ConstraintViolation<LinkDto>> violation=    validator.validate( dto);
		if(violation.isEmpty()) {
			 boolean saving = repo.save(dto);
			 System.out.println(saving );
		}
		else {
			System.out.println("error");
			System.out.println(violation);
		}
		
		return false;
	}

	@Override
	public boolean ValidateUpdate(Integer id, String mail) {
		 
	 
		 boolean update = repo.Update(id, mail);
		 System.out.println( update);
	
		
		return false;
	}

	@Override
	public boolean ValidateRead(String mail) {
		ResultSet read= repo.Read(mail);
		System.out.println("read");
		return false;
	}
	@Override
	public boolean ValidateReadall(LinkDto dto) {
		ResultSet read= repo.Read(dto );
		System.out.println("read");
		return false;
	}

	@Override
	public boolean Delete(int id, String mail) {
		// TODO Auto-generated method stub
		boolean delete =repo.Delete(id, mail);
		return false;
	}

	@Override
	public boolean ReadById(int Id, String mail) {
		ResultSet read= repo.Reading(Id, mail);
		return false;
	}

}
