package com.xworkz.creativity.service;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.creativity.dto.CreativityDto;
import com.xworkz.creativity.repo.CreativeRepo;

@Service
public class CreativeServiceImpl implements CreativeService {
	
	@Autowired
	private CreativeRepo repo;

	@Override
	public boolean save(CreativityDto dto) {
		 if(dto!= null) {
			//if( dto.getId()>0) {
				if(dto.getName().length()>3) {
					if(dto.getFatherName().length()>3) {
						if(dto.getMotherName().length()>3) {
							if(dto.getPhoneNo()>8) {
								if(dto.getEmail().length()>13) {
									if(dto.getLocation().length()>4) {
										return repo.save(dto);
										
									}
									System.out.println(" location invalid");
									return false;
									
									
								}
								System.out.println(" email invalid");
								return false;
								
							}
							System.out.println("phone number invalid");
							return false;
							
						}
						System.out.println("Mothername invalid");
						return false;
					}
					System.out.println("Fathername invalid");
					return false;
				}
				System.out.println("name invalid");
				return false;
			//}
//			System.out.println("id invalid");
//			return false;
		 }
		return false;
	}

}
