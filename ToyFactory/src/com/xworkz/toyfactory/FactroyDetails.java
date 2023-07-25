package com.xworkz.toyfactory;

import java.util.List;

import com.xworkz.toyfactory.dto.ToyFactorydto;
import com.xworkz.toyfactory.service.TotserviceImpl;
import com.xworkz.toyfactory.service.Toyservice;

public class FactroyDetails {

	public static void main(String[] args) {
		 ToyFactorydto dto= new ToyFactorydto(1, "Golly Jolly toys", "rakesh", 56, 2001);
		 ToyFactorydto dto1= new ToyFactorydto(5, "Lego", "harry", 64, 1990);
		 
        Toyservice service= new TotserviceImpl();
//		 service.saving(dto1);
//		 
//	 ToyFactorydto result =service.FindByname("'mohit'");
//	 System.out.println(result);
//    service.FindByid(1);
//	 
//	boolean update01= service.Updateprofitbyname("'mohit'", 92);
//		System.out.println(update01);	
//	
//	 service.updateFactorybyNameandid("'sam'", 4, "a2b");
//	    service.deleteByid(4);
	 
//	 
     
	 
	 List<ToyFactorydto>  readall= service.readAll();
	 readall.forEach((values)->{System.out.println(values);});
	  
	 
	 
	}

}
