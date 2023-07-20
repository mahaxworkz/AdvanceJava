package com.xworkz.forest.repo;

import com.xworkz.forest.dto.ForestDto;

public interface ForestRepo {
	
	public boolean saving( ForestDto dto);
	
	public ForestDto Reading( int id);
	public boolean  FindByID(int id  );
	
	public boolean UpdateByID(int id ,String name );
	
	public boolean Delete(int id);

}
