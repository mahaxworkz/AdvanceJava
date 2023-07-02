package com.xworkz.eventorganize.service;

import com.xworkz.eventorganize.dto.Organizedto;

public interface EventService {
	
	boolean save (Organizedto org);
	boolean Update ( String name,String email);
	
	boolean Updating(Organizedto org ,int id ,int award);
	boolean UpdateMail(Organizedto org , int id);
	boolean UpdateDto(Organizedto org ,int id);
}
