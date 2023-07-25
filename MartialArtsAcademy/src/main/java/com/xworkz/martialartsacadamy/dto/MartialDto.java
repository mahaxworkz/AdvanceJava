package com.xworkz.martialartsacadamy.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
@Table(name="martial")
@Entity
public class MartialDto {
	@Id
	private int id;
	@NotBlank
	@NotEmpty
	private String Acadamyname;
	private int dutration;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private  String mastername;
	private int fee;
	
	public MartialDto() {
		System.out.println("default");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcadamyname() {
		return Acadamyname;
	}
	public void setAcadamyname(String acadamyname) {
		Acadamyname = acadamyname;
	}
	public int getDutration() {
		return dutration;
	}
	public void setDutration(int dutration) {
		this.dutration = dutration;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMastername() {
		return mastername;
	}
	public void setMastername(String mastername) {
		this.mastername = mastername;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "MartialDto [id=" + id + ", Acadamyname=" + Acadamyname + ", dutration=" + dutration + ", type=" + type
				+ ", mastername=" + mastername + ", fee=" + fee + "]";
	}
	public MartialDto(int id, String acadamyname, int dutration, String type, String mastername, int fee) {
		super();
		this.id = id;
		Acadamyname = acadamyname;
		this.dutration = dutration;
		this.type = type;
		this.mastername = mastername;
		this.fee = fee;
	}

	
}
