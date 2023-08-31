package com.xworkz.taxi1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxi1.config.TaxiConfig;
import com.xworkz.taxi1.dto.TaxiDto;
import com.xworkz.taxi1.service.TaxiService;
import com.xworkz.taxi1.service.TaxiServiceImpl;

public class TaxiRunner {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(TaxiConfig.class);
		TaxiService service=   con.getBean(TaxiServiceImpl.class);
		
		TaxiDto dto = new TaxiDto(6,   357682,  3500,   true, "ooty", 6);
		
	
	 //   service.saveTaxi(dto);
		//service.updateTaxiEarning(4700, 2);
		// service.taxiAvailableById(true, 1);
//		 List< TaxiDto>	avail=  service.findTaxiAvailable( true);
//		System.out.println(avail);
//		
//		 List< TaxiDto> location=service.findTaxiByLocation( "theni");
//		 System.out.println(location);
		
		 List< TaxiDto> list =    service.readAll();
		 list.forEach((i)->{System.out.println(i); });
		 
//		  
//		  boolean book=service.booking(0, false);
//		 System.out.println(book);
//		 
//		  TaxiDto book=service.Minvalue();
//		 System.out.println(book);
		
	}

}
