package com.xworkz.forest.service;

import com.xworkz.forest.dto.ForestDto;

public interface ForestService {
	
	public boolean save(ForestDto dto);
	public ForestDto Reading(int id) ;
	public boolean  FindByID(int id  );
	public  boolean  UpdateByID(int id,String name );
	public boolean Delete(int id);
	

}
