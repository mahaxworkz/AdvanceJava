package com.xworkz.linkedin.dto;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

 



 
public class LinkDto {
	private int id;
	@NotBlank
	@NotEmpty
	@Size(min=2 , max=15)
	private String name;
	 
	private Integer age;
	@NotBlank
	@NotEmpty
	@Size(min=2 , max=15)
	private String fathername;
	@NotBlank
	@NotEmpty
	private String area;
	private String qualification;
	@NotEmpty
	private String skills;
	@NotBlank
	@NotEmpty
	private String areeOfInterest;
	 
	private Integer phoneno;
	@NotEmpty
	@Email
	private String email;
	private int experience;
	@NotBlank
	@NotEmpty
	private String searchingjob;
	private String jobsites;
	private int connection;
	private int presentation;
	private Date DOB;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getAreeOfInterest() {
		return areeOfInterest;
	}
	public void setAreeOfInterest(String areeOfInterest) {
		this.areeOfInterest = areeOfInterest;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSearchingjob() {
		return searchingjob;
	}
	public void setSearchingjob(String searchingjob) {
		this.searchingjob = searchingjob;
	}
	public String getJobsites() {
		return jobsites;
	}
	public void setJobsites(String jobsites) {
		this.jobsites = jobsites;
	}
	public int getConnection() {
		return connection;
	}
	public void setConnection(int connection) {
		this.connection = connection;
	}
	public int getPresentation() {
		return presentation;
	}
	public void setPresentation(int presentation) {
		this.presentation = presentation;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public LinkDto() {
		System.out.println("default");
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
	
	@Override
	public String toString() {
		return "LinkDto [id=" + id + ", name=" + name + ", age=" + age + ", fathername=" + fathername + ", area=" + area
				+ ", skills=" + skills + ", areeOfInterest=" + areeOfInterest + ", phoneno=" + phoneno + ", email="
				+ email + ", experience=" + experience + ", searchingjob=" + searchingjob + ", jobsites=" + jobsites
				+ ", connection=" + connection + ", presentation=" + presentation + ", DOB=" + DOB + "]";
	}
	
	
	public LinkDto(int id, String name, int age, String fathername, String area, String skills, String areeOfInterest,
			int phoneno, String email, int experience, String searchingjob, String jobsites, int connection,
			int presentation, Date dOB) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.fathername = fathername;
		this.area = area;
		this.skills = skills;
		this.areeOfInterest = areeOfInterest;
		this.phoneno = phoneno;
		this.email = email;
		this.experience = experience;
		this.searchingjob = searchingjob;
		this.jobsites = jobsites;
		this.connection = connection;
		this.presentation = presentation;
		DOB = dOB;
	}

	
}
