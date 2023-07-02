package com.xworkz.indeedreport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {
		 
			
			  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				 
				e.printStackTrace();
			}
			  try {
				  
				  Connection sys=DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed","root","Xworkzodc@123");
				 // String query02 = "select * from indeedreport";
				  //String query02 = "select * from indeedreport where name='Venkatesh' ";
				//  String query02 = "select * from indeedreport where id=2";
				  String query02 = "select * from indeedreport where qualification='B.E(EEE)'";
 
					Statement statement=sys.createStatement();
					ResultSet result =statement.executeQuery(query02);
					System.out.println(result);
					if (result != null) {
						while(result.next()) {
							System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getString(3) + "" + result.getInt(4) +result.getString(5)
							+ "" + result.getLong(6) + "" + result.getString(7) + "" + result.getString(8)+ "" + result.getString(9) +"" + result.getString(10));
						}
					}
				 
					sys.close();
			  }catch(SQLException e){
				  e.printStackTrace();
			  }
			  
				
		 

	}

}
