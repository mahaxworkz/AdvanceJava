package com.xworkz.forest.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
 
@Table(name = "Forest")
@Entity
public class ForestDto {
	
	@Id
	
	private int id;
	private String name;
	private String  state;
	private String type;
	private int area;
	
	public ForestDto() {
		System.out.println("default");
	}
	
	
	public ForestDto(int id, String name, String state, String type, int area) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.type = type;
		this.area = area;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "ForestDto [id=" + id + ", name=" + name + ", state=" + state + ", type=" + type + ", area=" + area
				+ "]";
	}
	
	
	

}
