package com.xworkz.musicapp.service;

import java.util.List;

import com.xworkz.musicapp.dto.MusicDto;

public interface MusicService {
	public boolean save(MusicDto dto);
	public List<MusicDto> Readall();
	public MusicDto FindByName(String name);
	public boolean updateAppsizeAndRatingByName(float size,float rate,String name);
	public boolean Deletebyid(int id);

}
