package com.xworkz.musicapp.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
 

import com.xworkz.musicapp.dto.MusicDto;
import com.xworkz.musicapp.repo.MusicRepo;
import com.xworkz.musicapp.repo.MusicRepoImpl;

public class MusicServiceImpl implements MusicService {

	MusicRepo repo=new MusicRepoImpl();
	@Override
	public boolean save(MusicDto dto) {
		ValidatorFactory  factory=	Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<MusicDto>> violation=validator.validate(dto);
		if(violation.isEmpty()) {
			
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<MusicDto> Readall() {
		// TODO Auto-generated method stub
		return repo.Readall();
	}

	@Override
	public MusicDto FindByName(String name ) {
		if(name!=null) {
			return repo.FindByName(name);
		}
		return null;
	}

	@Override
	public boolean updateAppsizeAndRatingByName(float size, float rate, String name) {
		 if(size>0 && rate >0 && name!= null) {
			 return repo.updateAppsizeAndRatingByName(size, rate, name);
		 }
		return false;
	}

	@Override
	public boolean Deletebyid(int id) {
		 if(id>0) {
			 return repo.Deletebyid(id);
		 }
		return false;
	}

}
