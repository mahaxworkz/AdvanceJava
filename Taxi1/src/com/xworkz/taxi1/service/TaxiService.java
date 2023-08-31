package com.xworkz.taxi1.service;

import java.util.List;

import com.xworkz.taxi1.dto.TaxiDto;

public interface TaxiService {
	public boolean saveTaxi(TaxiDto dto);

	public boolean  updateTaxiEarning(int amount,int id);
	public boolean taxiAvailableById( boolean status,int id);
	 public  List< TaxiDto> findTaxiByLocation(String location);
	    public List< TaxiDto> findTaxiAvailable(boolean available);
	    public  List< TaxiDto> readAll();
	    public boolean booking(int earn,boolean avail);
	    public TaxiDto  Minvalue();
}
