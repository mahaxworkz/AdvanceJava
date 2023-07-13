package com.xworkz.wenzio.service;

import java.sql.ResultSet;

import com.xworkz.wenzio.dto.wenzioDto;

public interface WenService {
	
	public boolean saving(wenzioDto dto) throws Exception;
	
	public ResultSet finding(wenzioDto dto,String mail )  throws Exception;

}
