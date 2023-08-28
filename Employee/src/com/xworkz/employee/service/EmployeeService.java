package com.xworkz.employee.service;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeService {
	
	public boolean save(EmployeeDto dto);
	public EmployeeDto findByName(String name);
	public EmployeeDto findByNameAndEmail(String name,String Email);
	public boolean updateageByName(String name,int age);
	public boolean updateAddressByNameandid(String name,int  id,String address);
	public boolean deleteByName(String name);
	public boolean deleteByNameandemail(String name,String email);
	 public List<EmployeeDto>readAll();
	
	
	

}
