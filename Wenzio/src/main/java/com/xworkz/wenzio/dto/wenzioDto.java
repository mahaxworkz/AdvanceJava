package com.xworkz.wenzio.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class wenzioDto {
	@NotBlank
	@NotEmpty
	private String name;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	@NotBlank
	@NotEmpty
	private String pickup;
	@NotBlank
	@NotEmpty
	private String destination;
	private String number;
	private String time;
	private String date;
	private String gender;
	@NotBlank
	@NotEmpty
	private String payment;
	@NotBlank
	@NotEmpty
	private String vehicle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "wenzioDto [name=" + name + ", email=" + email + ", pickup=" + pickup + ", destination=" + destination
				+ ", number=" + number + ", time=" + time + ", date=" + date + ", gender=" + gender + ", payment="
				+ payment + ", vehicle=" + vehicle + "]";
	}

	
	
	
}
