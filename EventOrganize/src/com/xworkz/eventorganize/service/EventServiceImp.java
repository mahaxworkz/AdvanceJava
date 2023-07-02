package com.xworkz.eventorganize.service;

import com.xworkz.eventorganize.Repository.EventRepo;
import com.xworkz.eventorganize.Repository.EventRepoImp;
import com.xworkz.eventorganize.dto.Organizedto;

public class EventServiceImp  implements EventService{
      EventRepo repo= new EventRepoImp();
	@Override
	public boolean save(Organizedto org) {
		boolean method = repo.SaveData(org);
		System.out.println(method);
		 System.out.println("saved");
		return false;
	}
	@Override
	public boolean Update(  String name,String email) {
		boolean method01 = repo.UpdateDataByName (name, email);
		System.out.println(method01);
		return false;
	}
	@Override
	public boolean Updating(Organizedto org, int id, int award) {
		boolean method02 =  repo.UpdateDataById(org, id, award);
		System.out.println(method02);
		return false;
	}
	@Override
	public boolean UpdateMail(Organizedto org, int id) {
		boolean method03 =  repo.UpdateEmail(org, id);
		System.out.println(method03);
		return false;
	}
	@Override
	public boolean UpdateDto(Organizedto org, int id) {
		boolean method04 =  repo.UpdateEmail(org, id);
		System.out.println(method04);
		return false;
	}

}
