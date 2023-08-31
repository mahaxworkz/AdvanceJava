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

@WebServlet(value = "/view" ,loadOnStartup = 2)
public class ViewTaxiServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 resp.setContentType("Text/HTML");
		 TaxiService  service= new TaxiServiceImpl();
		 List<TaxiAppDto> read= service.findTaxiAvailable( );
		 PrintWriter writer= resp.getWriter();
		 writer.println(" <h1> View table</h1>");
		 writer.println("<form action=\"book\" method=\"post\">");

		 writer.println("<table>");
		  for(TaxiAppDto dto : read) {
			  
			  writer.println("<table>");
			  
				 writer.println("<tr>");
				 writer.println(dto.getId());
				 writer.println("</tr>");
				 
				 writer.println("<tr>");
				 writer.println(dto.getTaxiNo());
				 writer.println("</tr>");
				 
				 writer.println("<tr>");
				 writer.println(dto.getEarnings());
				 writer.println("</tr>");
				 
				 writer.println("<tr>");
				 writer.println(dto.getLocation());
				 writer.println("</tr>");
				  
				 writer.println("<tr>");
				 writer.println(dto.getTrips());
				 writer.println("</tr>");
				 
				  
				 writer.println("<tr>");
				 writer.println(dto.isAvailable());
				 writer.println("</tr>");
				 
				
				 
		  }
		 
		  writer.println("</table>");
		  
		  writer.println(" <button type=\"submit\"> submit</button>");
		 
		  writer.println("</form>");
		  
		  
		  
		  
	}
	
	 

}
