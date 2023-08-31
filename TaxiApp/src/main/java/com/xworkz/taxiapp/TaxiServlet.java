package com.xworkz.taxiapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxiapp.dto.TaxiAppDto;
import com.xworkz.taxiapp.service.TaxiService;
import com.xworkz.taxiapp.service.TaxiServiceImpl;

@WebServlet(value = "/data"  ,loadOnStartup = 1)
public class TaxiServlet extends HttpServlet {
	
	
	
	@Override
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		
		TaxiService  service= new TaxiServiceImpl();
		
		resp.setContentType( "text/HTML");
		 PrintWriter writer= resp.getWriter();
		
		String id=req.getParameter("id");
		String num=req.getParameter("taxiNo");
		String earn=req.getParameter("earnings");
		String  loc=req.getParameter("location");
		String available=req.getParameter("available");
		String trip=req.getParameter("trips");
		
		TaxiAppDto dto= new  TaxiAppDto( Integer.valueOf(num),Integer.valueOf( earn) , Boolean.valueOf(available) ,loc, Integer.valueOf(trip));
		 
		
		
 	if(dto != null) {
			service.saveTaxi(dto);
			System.out.println("saved");
			 req.getRequestDispatcher("/view").forward(req, resp);
		}
		else {
			System.out.println(" not saved");
		}
		
		
		
		}

}
