package com.xworkz.taxi1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi1.repo.TaxiRepo;
import com.xworkz.taxi1.dto.TaxiDto;
@Component
public class TaxiServiceImpl implements TaxiService {

	
	@Autowired
	private TaxiRepo repo;
	@Override
	public boolean saveTaxi(TaxiDto dto) {
		 
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getTaxiNo()>2000) {
					if(dto.getEarnings()>3000) {
						if(dto.getLocation()!= null) {
							if(dto.getTrips()>3) {
							//	if(dto.isAvailable()) {
									System.out.println("save");
									return repo.saveTaxi(dto);
									
							//	}
								//System.out.println("not available");
							//	return false;
							}
							System.out.println("Not that much oof trips");
							return false;
						}
						System.out.println(" mention the location");
						return false;
					}
					System.out.println("poor earning");
					return false;
				}
				System.out.println(" TaxiNo invalid");
				return false;
			}
			System.out.println(" id invalid");
			return false;
		}
		System.out.println("dto null");
		return false;
	}
	@Override
	public boolean updateTaxiEarning(int amount, int id) {
		 if(amount>2000) {
			 if(id>0) {
				 return repo.updateTaxiEarning(amount, id);
			 }
			 return false;
		 }
		return false;
	}
	@Override
	public boolean taxiAvailableById(boolean status, int id) {
		 if(status) {
			 if(id>0) {
				 return repo.taxiAvailableById(status, id);
			 }
			 return false;
		 }
		return false;
	 
	}
	@Override
	public List< TaxiDto> findTaxiByLocation(String location) {
		if(location!=null) {
		return	repo.findTaxiByLocation(location);
		}
		return null;
	}
	@Override
	public  List< TaxiDto> findTaxiAvailable(boolean available) {
		 
		return repo.findTaxiAvailable(available);
	}
	@Override
	public List<TaxiDto> readAll() {
		 
		return repo.readAll();
	}
	@Override
	public boolean booking(int earn, boolean avail) {
		
	     TaxiDto dto = repo.Minvalue();
	     if(dto !=null) {
	    	 System.out.println("booked");
	    	// dto.setAvailable(avail);
	    return	repo.booking(dto.getId(), avail);
	    	 
	     }
		System.out.println("no data found");
		return false;
		 
		 
	}
	@Override
	public TaxiDto Minvalue() {
		System.out.println("found");
		
		return repo.Minvalue();
	}
	 
	 

}
