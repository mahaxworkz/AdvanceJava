package com.xworkz.taxiapp.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxiapp.dto.TaxiAppDto;
import com.xworkz.taxiapp.repo.TaxiRepo;
import com.xworkz.taxiapp.repo.TaxiRepoImpl;

 
public class TaxiServiceImpl implements TaxiService {

	 
  TaxiRepo repo =new TaxiRepoImpl();

	@Override
	public boolean saveTaxi(TaxiAppDto dto) {
		 
		if(dto!=null) {
			System.out.println("save");
			return repo.saveTaxi(dto); 
		 
		}
		System.out.println("dto null");
		return false;
	}

	@Override
	public boolean updateTaxiEarning(int amount, int id) {
		if (amount > 2000) {
			if (id > 0) {
				return repo.updateTaxiEarning(amount, id);
			}
			return false;
		}
		return false;
	}

	@Override
	public boolean taxiAvailableById(boolean status, int id) {
		if (status) {
			if (id > 0) {
				return repo.taxiAvailableById(status, id);
			}
			return false;
		}
		return false;

	}

	@Override
	public List<TaxiAppDto> findTaxiByLocation(String location) {
		if (location != null) {
			return repo.findTaxiByLocation(location);
		}
		return null;
	}

	@Override
	public List<TaxiAppDto> findTaxiAvailable( ) {

		return repo.findTaxiAvailable( );
	}

	@Override
	public List<TaxiAppDto> readAll() {

		return repo.readAll();
	}

	@Override
	public boolean booking(int  id,int earn) {

		  TaxiAppDto dto = repo.Minvalue();
		List<TaxiAppDto> list = repo.findTaxiAvailable();
		  
			
		
		if (dto != null) {
			System.out.println("booked");
			// dto.setAvailable(avail);
			return repo.booking(id,earn+200);

		}
		System.out.println("no data found");
		return false;

	}

	@Override
	public    TaxiAppDto Minvalue() {
		System.out.println("found");

		return repo.Minvalue();
	}

}
