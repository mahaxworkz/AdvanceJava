package com.xworkz.taxiapp.repo;

import java.util.List;

 
import com.xworkz.taxiapp.dto.TaxiAppDto;

public interface TaxiRepo {
	public boolean saveTaxi( TaxiAppDto dto);
	
	public boolean  updateTaxiEarning(int amount,int id);
	
	
	public boolean taxiAvailableById( boolean status,int id);
    public List< TaxiAppDto> findTaxiByLocation(String location);
    public  List< TaxiAppDto>findTaxiAvailable( );
    
    public  List< TaxiAppDto> readAll();
    public   TaxiAppDto Minvalue( );
   
    public  boolean booking(int id, int earn);
    

}
