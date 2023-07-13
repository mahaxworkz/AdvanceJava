package com.xworkz.wenzio;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.wenzio.dto.wenzioDto;
import com.xworkz.wenzio.service.WenService;
import com.xworkz.wenzio.service.WenserviceImpl;
@WebServlet(urlPatterns = "/sending")
public class WenzioServlet  extends HttpServlet{

	wenzioDto wenzio= new wenzioDto();
	WenService service= new WenserviceImpl() ; 
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		 String name= req.getParameter("name" );
		String number = req.getParameter("number");
		String pickup = req.getParameter("from");
		String destination = req.getParameter("to");
		String  gender = req.getParameter("gender");
		String vehicle = req.getParameter("type");
		String pay = req.getParameter("pay");
		String email = req.getParameter("email");
		String date = req.getParameter("date");
		String time= req.getParameter("time");
		
		wenzio.setDate(date);
		wenzio.setDestination(destination);
		wenzio.setEmail(email);
		wenzio.setGender(gender);
		wenzio.setName(name);
		wenzio.setNumber(number);
		wenzio.setPayment(pay);
		wenzio.setPickup(pickup);
		wenzio.setTime(time);
		wenzio.setVehicle(vehicle);
		
		resp.setContentType( "text/HTML");
		 PrintWriter writer= resp.getWriter();
			 
		try {
			//service.saving(wenzio);
		ResultSet	find = service.finding(wenzio, email);
		writer.println(find);
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
		
		 writer.println("<h1><center>information</center></h1>");
			writer.println("<h1>welcome to Wenzio!! "+name+"!!<h1><br>");
			 
			 
			 
	}
	
	
}
