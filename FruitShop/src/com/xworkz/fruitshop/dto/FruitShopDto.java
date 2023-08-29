package com.xworkz.fruitshop.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name ="fruitshop")
@Entity
@NamedQuery(name = "findByName" ,query = "Select dto from FruitShopDto dto where dto.shopName=: nm")
public class FruitShopDto {
	@Id
	private int id;
	private String shopName;
	private String ownernName;
	private int noOfBranches;
	private String review;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getOwnernName() {
		return ownernName;
	}
	public void setOwnernName(String ownernName) {
		this.ownernName = ownernName;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	
	  public FruitShopDto() {
		 System.out.println("default");
	}
	  
	  
	  
	public FruitShopDto(int id, String shopName, String ownernName, int noOfBranches, String review) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.ownernName = ownernName;
		this.noOfBranches = noOfBranches;
		this.review = review;
	}
	@Override
	public String toString() {
		return "FruitShopDto [id=" + id + ", shopName=" + shopName + ", ownernName=" + ownernName + ", noOfBranches="
				+ noOfBranches + ", review=" + review + "]";
	}
	
	

}
