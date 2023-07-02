package com.xworkz.eventorganize.Repository;

import com.xworkz.eventorganize.dto.Organizedto;

public interface EventRepo {

	boolean SaveData(Organizedto org);
	boolean UpdateDataByName(String name,String email);
	boolean UpdateDataById(Organizedto org ,int id ,int award);
	boolean UpdateEmail(Organizedto org,int id);
	boolean UpdateDto(Organizedto org,int id);
}
