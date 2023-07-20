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
		 service.saving(dto1);
		 
	 ToyFactorydto result =service.FindByID("'mohit'");
	 System.out.println(result);
	 ToyFactorydto result1 =service.FindByyear(2001);
	 System.out.println(result1);
	 
	boolean update01= service.Updateprofitbyname("'mohit'", 92);
		System.out.println(update01);	
	 
	 boolean update02=service.updateFactoryAndProfitbyName("'sam'", 79, "Fisher-price");
	 System.out.println(update02);
	 
	 boolean update03=service.updateFactoryAndProfitAndOwnerbyYear("Mehana", 67, "MVS toy store", 2008);
	 System.out.println(update03);
	 
	 boolean delete= service.deleteByname("'harry'");
	 System.out.println(delete);
	 
	 List<ToyFactorydto>  readall= service.readAll();
	 readall.forEach((values)->{System.out.println(values);});
	  
	 
	 
	}

}
