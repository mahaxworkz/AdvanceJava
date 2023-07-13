package com.xworkz.wenzio.repository;

import java.sql.ResultSet;

import com.xworkz.wenzio.dto.wenzioDto;

public interface Wenrepo {
	
	public boolean save(wenzioDto dto) throws Exception;
	public  ResultSet  FindbyMail(wenzioDto dto ,String mail) throws Exception;
	
	
	

}
