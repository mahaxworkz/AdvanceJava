package com.xworkz.animestore.service;

import java.util.List;

import com.xworkz.animestore.dto.AnimeDto;
import com.xworkz.animestore.repo.AnimeRepo;
import com.xworkz.animestore.repo.AnimerepoImpl;

public class AnimeserviceImpl implements AnimeService {

	 AnimeRepo repo= new AnimerepoImpl();
	public boolean Save(AnimeDto dto) {
		 if(dto!=null) {
			 System.out.println("validated");
			 return repo.Save(dto);
		 }
		return false;
	}
	@Override
	public List<AnimeDto> Readall() {
		 
		return  repo.Readall() ;
	}
	@Override
	public AnimeDto findByname(String name) {
		 if(name!=null) {
		return  repo.findByname(name);}
		return null;
	}
	@Override
	public boolean updatebranchesById(int id, int branch) {
		 if(id>0) {
		return repo.updatebranchesById(id, branch);}
		return false;
		 
	}
	@Override
	public boolean UpdateAreaByname(String area, String name) {
		 if(area!= null && name!= null) {
			 return repo.UpdateAreaByname(area, name);
		 }
		return false ;
	}
	@Override
	public boolean DeleteById(int id) {
		 
		return  repo.DeleteById(id);
	}
	@Override
	public boolean DeleteByname(String name) {
		 
		return  repo.DeleteByname(name);
	}

}
