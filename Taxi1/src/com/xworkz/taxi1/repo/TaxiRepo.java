package com.xworkz.taxi1.repo;

import java.util.List;

import com.xworkz.taxi1.dto.TaxiDto;

public interface TaxiRepo {
	public boolean saveTaxi(TaxiDto dto);
	
	public boolean  updateTaxiEarning(int amount,int id);
	
	
	public boolean taxiAvailableById( boolean status,int id);
    public List< TaxiDto> findTaxiByLocation(String location);
    public  List< TaxiDto>findTaxiAvailable(boolean available);
    
    public  List< TaxiDto> readAll();
    public   TaxiDto Minvalue( );
   
    public  boolean booking(int id,boolean avail);
    

}
