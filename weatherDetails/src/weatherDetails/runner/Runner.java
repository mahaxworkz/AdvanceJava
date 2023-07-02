package weatherDetails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.DriverManager;

public class Runner {
	public static void main(String[] args)   {
		
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		 
		e.printStackTrace();
	}
	  try {
		  String query02 = "select * from annualreport";
		  Connection sys=DriverManager.getConnection("jdbc:mysql://localhost:3306/annualreport","root","Xworkzodc@123");
			//System.out.println(sys.getSchema()); 
			//String query ="insert into annualreport values(9,'coppercompany','up',56)";
			
			Statement statement=sys.createStatement();
			ResultSet result =statement.executeQuery(query02);
			System.out.println(result);
			if (result != null) {
				while(result.next()) {
					System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getString(3) + "" + result.getInt(4));
				}
			}
			
			 
			 
			
			sys.close();
	  }catch(SQLException e){
		  e.printStackTrace();
	  }
	  
		
	}
	 
}
