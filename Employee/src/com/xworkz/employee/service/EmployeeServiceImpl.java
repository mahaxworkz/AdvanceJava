package com.xworkz.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.repo.EmployeeRepo;
@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	 private EmployeeRepo repo;

	@Override
	public boolean save(EmployeeDto dto) {
		
		if(dto != null) {
		if(dto.getId()>0) {
			if(dto.getName().length()>3 && dto.getName()!= null) {
				if(dto.getAddress() != null) {
					if(dto.getAge()>18) {
						if(dto.getDOB()!= null) {
							if(dto.getEmail()!= null) {
								if(dto.getFathername() != null) {
									if(dto.getGender() != null) {
										if(dto.getGraducation().equalsIgnoreCase("B.E") || dto.getGraducation().equalsIgnoreCase("B.Sc")) {
											if(dto.getPhoneNo()>=8) {
												repo.save(dto);
												return true;
												
											}
											 System.out.println(" number is invalid");
												return false;
										}
										 System.out.println("  degree is not  matching");
											return false;
									}
									 System.out.println(" gender is null");
										return false;
								}
								 System.out.println(" Father name is null");
									return false;
							}
							 System.out.println(" Email is null");
								return false;
						}
						 System.out.println(" Dob  invalid");
							return false;
					}
					 System.out.println("age is not valid");
						return false;
				}
				 System.out.println("address  null");
					return false;
			}
			 System.out.println("Name is not valid ,check the name");
				return false;
		}
		 System.out.println("id is invalid");
			return false;
		
		}
		 System.out.println("dto null");
		return false;
	}

	@Override
	public EmployeeDto findByName(String name) {
		 if(name!= null) {
			return  repo.findByName(name);
			 
		 }
		return null;
	}

	@Override
	public EmployeeDto findByNameAndEmail(String name, String Email) {
		 if(name != null) {
			 if(Email != null) {
				 return repo.findByNameAndEmail(name, Email);
				 
			 }
			 return null;
		 }
		return null;
	}

	@Override
	public boolean updateageByName(String name, int age) {
		 if(name != null) {
			 if(age>18) {
				 return repo.updateageByName(name, age);
			 }
			 System.out.println("age is not valid");
			 return false;
		 }
		 System.out.println(" name is not valid");
		return false;
	}

	@Override
	public boolean updateAddressByNameandid(String name, int id, String address) {
		 if(name != null) {
			 if( id>0) {
				 if(address!= null) {
					 return repo.updateAddressAndNameByid(name, id, address);
				 }
				 System.out.println(" address is null");
				 return false;
			 }
			 System.out.println(" id is not valid");
			 return false;
		 }
		 System.out.println(" name is not valid");
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		 if(name != null) {
			 return repo.deleteByName(name);
		 }
		return false;
	}

	@Override
	public boolean deleteByNameandemail(String name, String email) {
		if(name != null) {
			if(email != null) {
			return	repo.deleteByNameandemail(name, email);
				
			}
			System.out.println("email is not valid");
			return false;
		}
		System.out.println("name is not valid");
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {
		
		return  repo.readAll() ;
	}

}
