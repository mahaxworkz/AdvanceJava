package com.xworkz.bookstore;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")
public class BookstoreServlet extends HttpServlet {
	
	public BookstoreServlet() {
		System.out.println("book");
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("get method");
	}

}
