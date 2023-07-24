package com.xworkz.animestore.repo;

import java.util.List;

import com.xworkz.animestore.dto.AnimeDto;

public interface AnimeRepo {
	
	public boolean Save(AnimeDto dto);
	public List<AnimeDto > Readall();
	public  AnimeDto findByname(String name );
	public boolean updatebranchesById(int id,int branch);
	public boolean UpdateAreaByname(String area,String name);
	public boolean DeleteById( int id);
	public boolean DeleteByname(String name);

}
