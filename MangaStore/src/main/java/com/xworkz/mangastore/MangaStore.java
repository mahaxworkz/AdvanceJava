package com.xworkz.mangastore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mangastore.dto.MangaDto;
@WebServlet(urlPatterns = "/sending")
public class MangaStore  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  MangaDto manga=new MangaDto();
	  String name= req.getParameter("name");
	  String writter=req.getParameter("writer");
	  String pro = req.getParameter("production");
	  String address=req.getParameter("address");
	  String season =req.getParameter("season");
	  
	  
	  manga.setManganame(name);
	  manga.setAddress(address);
	  manga.setProduction(pro);
	  manga.setWriter(writter);
	  manga.setSeason(season);
	  manga.setType(req.getParameter("type"));
	  manga.setPayment(req.getParameter("pay"));
	  
	  System.out.println(manga);
	  resp.setContentType( "text/HTML");
		 PrintWriter writer= resp.getWriter();
		writer.println("<h1><center>information</center></h1>");
	writer.println("<h1> "+name+"<h1><br>");
	writer.println("<h1"+manga+"<h1>");
	writer.println(manga);
	
}
	
	
	
}
