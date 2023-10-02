package com.xworkz.creativity.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CreativitySchool")
@Entity
public class CreativityDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String fatherName;
	private String motherName;
	private String email;
	private String DOB;
	private String location;
	private long phoneNo;
	
	
	public CreativityDto() {
		System.out.println("default cons");
	}


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


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "CreativityDto [name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName + ", email="
				+ email + ", DOB=" + DOB + ", location=" + location + ", phoneNo=" + phoneNo + "]";
	}


	public CreativityDto(String name, String fatherName, String motherName, String email, String dOB, String location,
			long phoneNo) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		DOB = dOB;
		this.location = location;
		this.phoneNo = phoneNo;
	}
	 
	
	

	
	
	
}
