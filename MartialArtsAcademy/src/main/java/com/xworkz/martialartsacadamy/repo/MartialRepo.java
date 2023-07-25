package com.xworkz.martialartsacadamy.repo;

import java.util.List;

import com.xworkz.martialartsacadamy.dto.MartialDto;

 

public interface MartialRepo {
	
	public boolean saving(MartialDto dto);
	public MartialDto  FindByName(String name) ;
	public  MartialDto FindById( int id);
	public boolean UpdatebynameAndId(String  name,int  id,int fee);
	public boolean updatebyId(String  mastername,int id ); 
	public boolean deleteById( int id);
	public List<MartialDto> readAll();

}
