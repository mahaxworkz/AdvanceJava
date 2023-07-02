package com.xworkz.eventorganize.Repository;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.eventorganize.dto.Organizedto;

public class EventRepoImp implements EventRepo{

	@Override
	public boolean SaveData(Organizedto org) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  	
		}catch(Exception e) {
			e.printStackTrace();
		}
		try{
			 Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","Xworkzodc@123");
			 System.out.println(connect);
			 System.out.println("database connected");
			 
			 String query = "insert into event values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement statement= connect.prepareStatement(query);
			 System.out.println("inserted data" +statement);
			 
			 statement.setInt(1,org.getId());
			 statement.setString(2,org.getName());
			 statement.setInt(3,org.getNoOfBranches());
			 statement.setString(4,org.getOwner());
			 statement.setInt(5,org.getEmployees());
			 statement.setInt(6,org.getOrganizingEvents());
			 statement.setString(7,org.getLocation());
			 statement.setString(8,org.getState());
			 statement.setString(9,org.getCountry());
			 statement.setString(10,org.getMobileno());
			 statement.setString(11,org.getEmail());
			 statement.setInt(12,org.getAwards());
			 statement.setInt(13,org.getRank());
			 statement.setInt(14,org.getProfit());
			 statement.setString(15,org.getReview());
			 
			 int i= statement.executeUpdate();
			 System.out.println("insert into :" +i);
			statement.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean UpdateDataByName(  String name,String email) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","Xworkzodc@123") ;
			 String query = "update event set email = ? where name =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,email);
			 statement.setString(2,name);
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("updated");
			 }else {
				 System.out.println("error occured");
			 }
			 
			  con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return false;
	}

	@Override
	public boolean UpdateDataById(Organizedto org, int id, int award) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","Xworkzodc@123") ;
			 String query = "update event set awards =? where id =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 statement.setInt(1, award);
			 statement.setInt(2, id);
			  
			  //boolean i= statement.execute(query);
         	int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("updated");
			 }else {
				 System.out.println("error occured");
			 }
			 
			  
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		return false;
	}

	@Override
	public boolean UpdateEmail(Organizedto org, int id) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","Xworkzodc@123") ;
			 String query = "update event set email ='uv@gmail.com' where id=?" ;
			 
			 PreparedStatement statement= con.prepareStatement(query);
			 
			// statement.setString(1,org.getEmail());
			 statement.setInt(1, id);
			 
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("updated");
			 }else {
				 System.out.println("error occured");
			 }
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return false;
	}

	@Override
	public boolean UpdateDto(Organizedto org, int id) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","Xworkzodc@123") ;
			 String query = "update event set name=?,NoOfBranches=?,Owner =? ,employess=?,organizingEvents=? , loaction = ? ,state = ? ,country = ? where id=?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,org.getName());
			 statement.setInt(2,org.getNoOfBranches());
			 statement.setString(3,org.getOwner());
			 statement.setInt(4,org.getEmployees());
			 statement.setInt(5,org.getOrganizingEvents());
			 statement.setString(6,org.getLocation());
			 statement.setString(7,org.getState());
			 statement.setString(8,org.getCountry());
			 statement.setInt(9,org.getId());
			  
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println("updated");
			 }else {
				 System.out.println("error occured");
			 }
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return false;
	}

	
	
	
}
