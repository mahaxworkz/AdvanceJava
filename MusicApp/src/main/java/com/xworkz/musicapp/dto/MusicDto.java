package com.xworkz.musicapp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Table(name="Music")
@Entity
@NamedQuery(name = "FindName" ,query = "Select dto from MusicDto dto where dto.appname=:n")
@NamedQuery(name= "updatesize" ,query= "Update MusicDto dto set dto.appsize=:si ,dto.rating =:rt  where dto.appname=:n")
@NamedQuery(name= "deletebyid" ,query= "delete from MusicDto dto where dto.id=:i")
@NamedQuery(name = "Readall" ,query = "Select dto from MusicDto dto")
public class MusicDto {
	
	@Id
	private int id;
	@NotBlank
	@NotEmpty
	private String appname;
	@NotBlank
	@NotEmpty
	private String musictype;
	private boolean havePrimeMembership;
	private float appsize;
	private float rating;
	
	 public MusicDto() {
		 System.out.println("default");
	 }
	
	public MusicDto(int id, @NotBlank @NotEmpty String appname, @NotBlank @NotEmpty String musictype,
			boolean havePrimeMembership, float appsize, float rating) {
		super();
		this.id = id;
		this.appname = appname;
		this.musictype = musictype;
		this.havePrimeMembership = havePrimeMembership;
		this.appsize = appsize;
		this.rating = rating;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAppname() {
		return appname;
	}



	public void setAppname(String appname) {
		this.appname = appname;
	}



	public String getMusictype() {
		return musictype;
	}



	public void setMusictype(String musictype) {
		this.musictype = musictype;
	}



	public boolean isHavePrimeMembership() {
		return havePrimeMembership;
	}



	public void setHavePrimeMembership(boolean havePrimeMembership) {
		this.havePrimeMembership = havePrimeMembership;
	}



	public float getAppsize() {
		return appsize;
	}



	public void setAppsize(float appsize) {
		this.appsize = appsize;
	}



	public float getRating() {
		return rating;
	}



	public void setRating(float rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "MusicDto [id=" + id + ", appname=" + appname + ", musictype=" + musictype + ", havePrimeMembership="
				+ havePrimeMembership + ", appsize=" + appsize + ", rating=" + rating + "]";
	}

	
	
	
}
