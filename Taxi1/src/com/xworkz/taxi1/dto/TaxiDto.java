package com.xworkz.taxi1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Table(name = "taxi_safari")
@Entity
@NamedQuery(name = "updateEarning" ,query = "update TaxiDto dto set dto.earnings =:er where dto.id =:i")
@NamedQuery(name = "updateAvailability" ,query = "update TaxiDto dto set dto.isAvailable =:av where dto.id =:i")
@NamedQuery(name="findByLocation", query="select dto from TaxiDto dto where dto.location =: lo")
@NamedQuery(name="findByAvailability", query="select dto from TaxiDto dto where dto.isAvailable =: av")
@NamedQuery(name="readAll", query="select dto from TaxiDto dto")

@NamedQuery(name="book", query="update TaxiDto dto set dto.isAvailable =:av where dto.id=: i")
@NamedQuery(name="book1", query="select dto1 from TaxiDto dto1 where dto1.isAvailable = true and dto1.earnings = (select MIN(dto.earnings) from TaxiDto dto) ")
@NamedQuery(name="Avail", query="select dto from TaxiDto dto where dto.isAvailable = true")




public class TaxiDto {
	
	
	 
		
		@Id
		private int id;
		private int taxiNo;
		private int earnings;
		private boolean isAvailable;
		private String location;
		private int trips;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getTaxiNo() {
			return taxiNo;
		}
		public void setTaxiNo(int taxiNo) {
			this.taxiNo = taxiNo;
		}
		public int getEarnings() {
			return earnings;
		}
		public void setEarnings(int earnings) {
			this.earnings = earnings;
		}
		public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
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
		
		public TaxiDto() {
			 System.out.println("default");
		}
		public TaxiDto(int id, int taxiNo, int earnings, boolean isAvailable, String location, int trips) {
			super();
			this.id = id;
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

	



