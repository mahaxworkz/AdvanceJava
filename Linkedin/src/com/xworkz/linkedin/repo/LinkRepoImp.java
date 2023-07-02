package com.xworkz.linkedin.repo;

 

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 
import com.xworkz.linkedin.dto.LinkDto;

  

public class LinkRepoImp implements LinkRepo {

	@SuppressWarnings("deprecation")
	@Override
	public boolean save(LinkDto org) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  	
		}catch(Exception e) {
			e.printStackTrace();
		}
		try{
			 Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin","root","Xworkzodc@123");
			 System.out.println(connect);
			 System.out.println("database connected");
//			java.util.Date javaDate = new java.util.Date();
//			java.sql.Date dateof = new java.sql.Date(javaDate.getTime());
		//	 java.sql.Date Date = java.sql.Date(12, 12, 2001);
			 
		 	      
			//Date DOB = new Date(22-04-2001);
			 
			 //LocalDate dateOfBirth = LocalDate.of( 1979 , 1 , 10 );
		//	 long date = (21-04-2001);
			 
			 //java.sql.Date DOB =new java.sql.Date(dateOfBirth.getDayOfYear());
//			 String sDate1="2001/11/04";
//             java.sql.Date DOB=(java.sql.Date) new SimpleDateFormat("yyyy/MM/dd").parse(sDate1);
			 
			 String query = "insert into linkedin values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement statement= connect.prepareStatement(query);
			 System.out.println("inserted data" +statement);
			 
			 statement.setInt(1,org.getId());
			 statement.setString(2,org.getName());
			 statement.setInt(3,org.getAge());
			 statement.setString(4,org.getFathername());
			 statement.setString(5,org.getArea());
			 statement.setString(6,org.getQualification());
			 statement.setString(7,org.getSkills());
			 statement.setString(8,org.getAreeOfInterest());
			 statement.setInt(9,org.getPhoneno());
			 statement.setString(10,org.getEmail());
			 statement.setInt(11,org.getExperience());
			 statement.setString(12,org.getSearchingjob());
			 statement.setString(13,org.getJobsites());
			 statement.setInt(14,org.getConnection());
			 statement.setInt(16,org.getPresentation());
			 statement.setDate(15,new java.sql.Date(12, 12, 2001));
			 
			 int i= statement.executeUpdate();
			 System.out.println("insert into :" +i);
			statement.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Update(int id, String mail) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin","root","Xworkzodc@123") ;
			 String query = "update linkedin set email = ? where id =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			 statement.setInt(2,id);
			  
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
	public ResultSet Read(String mail) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin","root","Xworkzodc@123") ;
			 String query = "select * from linkedin   where email =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			  ResultSet result =statement.executeQuery();
			  
			  if (result != null) {
					while(result.next()) {
						 
						System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getInt(3) + "" + result.getString(4));
					}
				}			 
			  con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return null;
	}

	@Override
	public ResultSet Read(LinkDto org) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
		 }catch(Exception e) {
			 e.printStackTrace();
			 
		 }
		 try {
			 Connection con =DriverManager.getConnection( "jdbc:mysql://localhost:3306/linkedin","root","Xworkzodc@123");
			 String query ="select * from linkedin";
			 PreparedStatement statement= con.prepareStatement(query);
			 ResultSet result =statement.executeQuery();
			 if(result !=null) {
				 while(result.next()) {
					 System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getInt(3) + "" + result.getString(4) + result.getString(5)
					 +"" +result.getString(6));
					
					 
				 }
			 }
			 con.close();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return null;
	}

	@Override
	public boolean Delete(int id, String mail) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin","root","Xworkzodc@123") ;
			 String query = "delete from linkedin  where email = ?  OR id =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			 statement.setInt(2,id);
			  
			int i = statement.executeUpdate();
			 if(i>0) {
				 System.out.println(" deleted");
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
	public ResultSet Reading(int id, String mail) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 try {
			 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin","root","Xworkzodc@123") ;
			 String query = "select * from linkedin   where email =? and id =?" ;
			 PreparedStatement statement= con.prepareStatement(query);
			 
			 statement.setString(1,mail);
			 statement.setInt(2, id);
			  ResultSet result =statement.executeQuery();
			  
			  if (result != null) {
					while(result.next()) {
						 
						System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getInt(3) + "" + result.getString(4));
					}
				}			 
			  con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return null;
	}

}
