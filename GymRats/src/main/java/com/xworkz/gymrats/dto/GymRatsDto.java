package com.xworkz.gymrats.dto;

public class GymRatsDto {
	private String name;
	private String title;
	private Integer NoOftitles;
	private Boolean adSuits;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNoOftitles() {
		return NoOftitles;
	}
	public void setNoOftitles(Integer noOftitles) {
		NoOftitles = noOftitles;
	}
	public Boolean getAdSuits() {
		return adSuits;
	}
	public void setAdSuits(Boolean adSuits) {
		this.adSuits = adSuits;
	}
	
	
	
	public GymRatsDto() {
		System.out.println("de");
	}
	public GymRatsDto(String name, String title, Integer noOftitles, Boolean adSuits) {
		super();
		this.name = name;
		this.title = title;
		NoOftitles = noOftitles;
		this.adSuits = adSuits;
	}
	@Override
	public String toString() {
		return "GymRatsDto [name=" + name + ", title=" + title + ", NoOftitles=" + NoOftitles + ", adSuits=" + adSuits
				+ "]";
	}
	
	
	
 
}
