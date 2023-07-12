package com.xworkz.mangastore.dto;

import javax.validation.constraints.NotBlank;

 

public class MangaDto {
	
	@NotBlank
	private String  manganame;
	private String type;
	private String writer;
	private String Production;
	private String season;
	private String address;
	private String payment;
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getManganame() {
		return manganame;
	}
	public void setManganame(String manganame) {
		this.manganame = manganame;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getProduction() {
		return Production;
	}
	public void setProduction(String production) {
		Production = production;
	}
	public  String getSeason() {
		return season;
	}
	public void setSeason( String season) {
		this.season = season;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MangaDto [manganame=" + manganame + ", type=" + type + ", writer=" + writer + ", Production="
				+ Production + ", season=" + season + ", address=" + address + ", payment=" + payment + "]";
	}

}
