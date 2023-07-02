package com.xworkz.eventorganize.dto;

public class Organizedto {
	
	private int id;
	private String name;
	private int NoOfBranches;
	private String Owner;
	private int Employees;
	private int OrganizingEvents;
	private String location;
	private String state;
	private String  country;
	private String mobileno;
	private String Email;
	private int awards;
	private int rank;
	private int profit;
	private String review;
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
	public int getNoOfBranches() {
		return NoOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		NoOfBranches = noOfBranches;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public int getEmployees() {
		return Employees;
	}
	public void setEmployees(int employees) {
		Employees = employees;
	}
	public int getOrganizingEvents() {
		return OrganizingEvents;
	}
	public void setOrganizingEvents(int organizingEvents) {
		OrganizingEvents = organizingEvents;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAwards() {
		return awards;
	}
	public void setAwards(int awards) {
		this.awards = awards;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Organizedto [id=" + id + ", name=" + name + ", NoOfBranches=" + NoOfBranches + ", Owner=" + Owner
				+ ", Employees=" + Employees + ", OrganizingEvents=" + OrganizingEvents + ", location=" + location
				+ ", state=" + state + ", country=" + country + ", mobileno=" + mobileno + ", Email=" + Email
				+ ", awards=" + awards + ", rank=" + rank + ", profit=" + profit + ", review=" + review + "]";
	}
	public Organizedto(int id, String name, int noOfBranches, String owner, int employees, int organizingEvents,
			String location, String state, String country, String mobileno, String email, int awards, int rank,
			int profit, String review) {
		super();
		this.id = id;
		this.name = name;
		NoOfBranches = noOfBranches;
		Owner = owner;
		Employees = employees;
		OrganizingEvents = organizingEvents;
		this.location = location;
		this.state = state;
		this.country = country;
		this.mobileno = mobileno;
		Email = email;
		this.awards = awards;
		this.rank = rank;
		this.profit = profit;
		this.review = review;
	}
	public Organizedto() {
		 System.out.println("default");
	}
	
	

}
