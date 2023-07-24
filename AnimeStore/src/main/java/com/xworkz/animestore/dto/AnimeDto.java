package com.xworkz.animestore.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Table (name = "animestore")
@Entity
public class AnimeDto {
	@Id
	private int id;

    @NotBlank
    @NotNull
    @Size(min=3 , max=20)
	private String name;
    @NotBlank
    @NotNull
    @Size(min=3 , max=20)
	private String area;
	private int NoOfBranches;
	private boolean isgoodquality;
	@NotBlank
    @NotNull
    @Size(min=3 , max=20)
	private String ownername;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public AnimeDto() {
		System.out.println("default");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getNoOfBranches() {
		return NoOfBranches;
	}


	public void setNoOfBranches(int noOfBranches) {
		NoOfBranches = noOfBranches;
	}


	public boolean isIsgoodquality() {
		return isgoodquality;
	}


	public void setIsgoodquality(boolean isgoodquality) {
		this.isgoodquality = isgoodquality;
	}


	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


	@Override
	public String toString() {
		return "AnimeDto [id=" + id + ", name=" + name + ", area=" + area + ", NoOfBranches=" + NoOfBranches
				+ ", isgoodquality=" + isgoodquality + ", ownername=" + ownername + "]";
	}


	public AnimeDto(int id, String name, String area, int noOfBranches, boolean isgoodquality, String ownername) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		NoOfBranches = noOfBranches;
		this.isgoodquality = isgoodquality;
		this.ownername = ownername;
	}


	 
	
	
	
	
}
