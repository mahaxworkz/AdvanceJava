package com.xworkz.indeedreport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RunnerOfIndeed {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			 
			e.printStackTrace();
		}
	 try {
		 Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed","root","Xworkzodc@123"); 
		 String query = "insert into indeedreport values(10,'swetha','B.E(CSE)',1,'Swe@gmail.com',985674783,'python','exploring','theni','machinelearnig')";
		 Statement statement = connect.createStatement();
		 
		 int i =statement.executeUpdate(query);
		 System.out.println("effected row" +i);
		 
		 connect.close();
		 
	 }
	 catch(SQLException e) {
		 e.printStackTrace();
	 }

	}

}
