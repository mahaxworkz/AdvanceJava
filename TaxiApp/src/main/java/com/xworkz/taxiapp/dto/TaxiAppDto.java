package com.xworkz.taxiapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Table(name = "taxiapp")
@Entity
//@NamedQuery(name = "updateEarning" ,query = "update TaxiDto dto set dto.earnings =:er where dto.id =:i")
//@NamedQuery(name = "updateAvailability" ,query = "update TaxiDto dto set dto.isAvailable =:av where dto.id =:i")
//@NamedQuery(name="findByLocation", query="select dto from TaxiAppDto dto where dto.location =: lo")
 @NamedQuery(name="findByAvailability", query="select dto from TaxiAppDto dto where dto.isAvailable = true")
//@NamedQuery(name="readAll", query="select dto from TaxiDto dto")
//
@NamedQuery(name="book", query="update TaxiAppDto dto set dto.isAvailable = false,dto.earnings=:er  where dto.id=: i")
@NamedQuery(name="book1", query="select dto1 from TaxiAppDto dto1 where dto1.isAvailable = true and dto1.earnings = (select min(dto.earnings) from TaxiAppDto dto ) ")
//@NamedQuery(name="Avail", query="select dto from TaxiDto dto where dto.isAvailable = true")




public class TaxiAppDto {
	
	
	 
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id ;
		private  int taxiNo;
		private   int earnings;
		private boolean isAvailable;
		private String location;
		private   int trips;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public    int getTaxiNo() {
			return taxiNo;
		}
		public void setTaxiNo( int  taxiNo) {
			this.taxiNo = taxiNo;
		}
		public  int getEarnings() {
			return earnings;
		}
		public void setEarnings(int earnings) {
			this.earnings = earnings;
		}
		public  boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable( boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getTrips() {
			return trips;
		}
		public void setTrips(int trips) {
			this.trips = trips;
		}
		
		public TaxiAppDto() {
			 System.out.println("default");
		}
		public TaxiAppDto(  int taxiNo, int earnings,  boolean isAvailable, String location,  int trips) {
			super();
			 
			this.taxiNo = taxiNo;
			this.earnings = earnings;
			this.isAvailable = isAvailable;
			this.location = location;
			this.trips = trips;
		}
		@Override
		public String toString() {
			return "TaxiDto [id=" + id + ", taxiNo=" + taxiNo + ", earnings=" + earnings + ", isAvailable=" + isAvailable
					+ ", location=" + location + ", trips=" + trips + "]";
		}
		
		
		
		 
		
	}

	



