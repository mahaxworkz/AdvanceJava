package com.xworkz.employee.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "Employee_info")
@Entity
@NamedQuery(name = "FindName" , query = "Select dto from EmployeeDto dto where dto.name=:nm ")
@NamedQuery(name = "FindNameAndEmail" , query = "Select dto from EmployeeDto dto where dto.name=:nm and dto.email=:em ")
@NamedQuery(name = "UpdateByName",query="update EmployeeDto dto set dto.age=: ag where dto.name=:nm")
@NamedQuery(name = "UpdateAddressAndNameByid",query="update EmployeeDto dto set dto.name=: nm , dto.address=:ad where dto.id=:i")
@NamedQuery(name="deleteByName", query="delete from EmployeeDto dto  where dto.name=:nm")

@NamedQuery(name="deleteByNameAndMail", query="delete from EmployeeDto dto  where dto.name=:nm and dto.email =:em")

@NamedQuery(name = "readAll" , query="select dto from EmployeeDto dto ")

public class EmployeeDto {
	@Id
	private int id;
	private String name;
	private String gender;
	private String fathername;
	private int age;
	private String graducation;
	private String DOB;
	private  String address;
	private String email;
	private int phoneNo ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGraducation() {
		return graducation;
	}
	public void setGraducation(String graducation) {
		this.graducation = graducation;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public  String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public EmployeeDto(){
		System.out.println("default constructor");
	}
	public EmployeeDto(int id, String name, String gender, String fathername, int age, String graducation, String dOB,
			 String address, String email, int phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.fathername = fathername;
		this.age = age;
		this.graducation = graducation;
		DOB = dOB;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", gender=" + gender + ", fathername=" + fathername
				+ ", age=" + age + ", graducation=" + graducation + ", DOB=" + DOB + ", address=" + address + ", email="
				+ email + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
	

}
