package com.xworkz.martialartsacadamy.service;

import java.util.List;

import com.xworkz.martialartsacadamy.dto.MartialDto;
import com.xworkz.martialartsacadamy.repo.MartialRepo;
import com.xworkz.martialartsacadamy.repo.RepoImpl;

public class ServiceImpl implements MartialService {

	
	MartialRepo repo = new RepoImpl();
	@Override
	public boolean saving(MartialDto dto) {
	if(dto != null) {
		return  repo.saving(dto);
		
	}
		return false;
	}

	@Override
	public MartialDto FindByName(String name) {
		 if(name != null) {
			 return repo.FindByName(name);
		 }
		return null;
	}

	@Override
	public MartialDto FindById(int id) {
		 if(id>0) {
			 return repo.FindById(id);
		 }
		return null;
	}

	@Override
	public boolean UpdatebynameAndId(String name, int id, int fee) {
		 if( name != null && fee>0) { 
			 return repo.UpdatebynameAndId(name, id, fee);
		 } 
		return false;
	}

	@Override
	public boolean updatebyId(String mastername, int id) {
		 if(mastername != null && id>0) {
			 return repo.updatebyId(mastername, id);
		 }
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		 if(id>0) {
			 return repo.deleteById(id);
		 }
		return false;
	}

	@Override
	public List<MartialDto> readAll() {
		// TODO Auto-generated method stub
		return  repo.readAll();
	}

}
