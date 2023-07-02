package com.xworkz.linkedin.repo;

import java.sql.ResultSet;

import com.xworkz.linkedin.dto.LinkDto;

public interface LinkRepo {
	
	boolean save(LinkDto org);
	boolean Update (int id,String mail);
	ResultSet Read (String mail);
	ResultSet Read ( LinkDto org);
	boolean Delete(int id,String mail);
	ResultSet Reading (int id,String mail);
}
