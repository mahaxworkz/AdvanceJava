package com.xworkz.linkedin.service;

 

import com.xworkz.linkedin.dto.LinkDto;

public interface LinkService {
	boolean ValidateAndSave(LinkDto dto);
	boolean ValidateUpdate(Integer id ,String mail);
    boolean ValidateRead(String mail);
    boolean ValidateReadall(LinkDto dto) ;
    boolean Delete(int id ,String mail);
    boolean ReadById(int Id,String mail);
}
