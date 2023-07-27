package com.xworkz.musicapp.repo;

import java.util.List;

import com.xworkz.musicapp.dto.MusicDto;

public interface MusicRepo {

	public boolean save(MusicDto dto);
	public List<MusicDto> Readall();
	public MusicDto FindByName(String name);
	public boolean updateAppsizeAndRatingByName(float size,float rate,String name);
	public boolean Deletebyid(int id);
	 
	
	
	
	
	
	
}
