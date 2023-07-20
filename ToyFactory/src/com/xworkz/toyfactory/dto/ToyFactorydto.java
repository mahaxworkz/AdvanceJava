package com.xworkz.toyfactory.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "ToyFactory")
@Entity

public class ToyFactorydto {
	@Id
	private int id;
	private String FactoryName;
	private String owner;
	private float profit;
	private int year;
	
	
	
	public ToyFactorydto() {
		System.out.println("default");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFactoryName() {
		return FactoryName;
	}
	public void setFactoryName(String factoryName) {
		FactoryName = factoryName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public ToyFactorydto(int id, String factoryName, String owner, float profit, int year) {
		super();
		this.id = id;
		FactoryName = factoryName;
		this.owner = owner;
		this.profit = profit;
		this.year = year;
	}
	@Override
	public String toString() {
		return "ToyFactorydto [id=" + id + ", FactoryName=" + FactoryName + ", owner=" + owner + ", profit=" + profit
				+ ", year=" + year + "]";
	}
	

	
	
}
