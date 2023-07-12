package com.xworkz.pizzaapplication;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.pizzaapplication.dto.PizzaDto;
import com.xworkz.pizzaapplication.service.PizzaSer;
import com.xworkz.pizzaapplication.service.PizzaService;
@WebServlet (urlPatterns = "/sending" ,loadOnStartup = 1)
public class PizzaServlet extends HttpServlet {
	
	@Override
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	PizzaDto pizza=	new PizzaDto();
	PizzaSer service=new PizzaService()	;
		
		
		String name= req.getParameter( "name");
		String address= req.getParameter( "address");
	    String pay=req.getParameter("pay");
		 String type =req.getParameter( "type");
		 String size=req.getParameter("size");
		pizza.setName(name);
		pizza.setAddress(address);
		pizza.setPaymentmode(pay);
		pizza.setSize(size);
		pizza.setType(type);
		System.out.println(pizza);
				
		 resp.setContentType( "text/HTML");
		 PrintWriter writer= resp.getWriter();
		  try {
			service.save(pizza);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
		writer.println("<h1><center>information</center></h1>");
	writer.println("<h1> "+name+"<h1><br>");
	writer.println("<h1"+pizza+"<h1>");
	 
	writer.println(pizza);
	
		 
		 
	
		 }
	 
	}

