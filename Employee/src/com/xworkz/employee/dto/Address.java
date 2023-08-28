package com.xworkz.employee.dto;

public class Address {
	
	private int doorNo;
	private String street;
	private String area;
	private String state;
	private int pincode;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		  System.out.println("default");
	}
	public Address(int doorNo, String street, String area, String state, int pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	

	
}
