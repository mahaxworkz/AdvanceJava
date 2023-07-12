package com.xworkz.pizzaapplication.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class PizzaDto {
	
	
	@NotBlank
	@NotEmpty
	private String name;
	@NotBlank
	@NotEmpty
	private String address;
	@NotBlank
	@NotEmpty
	private String size;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private String paymentmode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public  String getSize() {
		return size;
	}
	public void setSize( String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", address=" + address + ", size=" + size + ", type=" + type
				+ ", paymentmode=" + paymentmode + "]";
	}

	
	
	
}
