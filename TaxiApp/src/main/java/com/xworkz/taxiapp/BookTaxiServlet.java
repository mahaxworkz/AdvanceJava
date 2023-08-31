package com.xworkz.taxiapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxiapp.dto.TaxiAppDto;
import com.xworkz.taxiapp.service.TaxiService;
import com.xworkz.taxiapp.service.TaxiServiceImpl;
@WebServlet(value = "/book" ,loadOnStartup = 3)
public class BookTaxiServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("Text/HTML");
		 TaxiService  service= new TaxiServiceImpl();
		 PrintWriter writer= resp.getWriter();
		 
		 
		 
		  TaxiAppDto dto = service.Minvalue();
		 if( dto!=null ) {
			 writer.println( "booked sucessfully");
//			 TaxiAppDto dto= service.Minvalue();
 			 writer.println(dto);
 			 service.booking(dto.getId(), dto.getEarnings());
//			 System.out.println(dto);
		 }
		 else {
			 writer.println( "error");
		 }
		
		 
		 
		 

	}

}
