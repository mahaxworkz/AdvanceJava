package com.xworkz.pizzaapplication.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.pizzaapplication.dto.PizzaDto;

public class RepoImpl implements PizzaRepo {

	@Override
	public boolean save(PizzaDto dto) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","Xworkzodc@123");
		 System.out.println(connect);
		 System.out.println("database connected");
		 String query = "insert into  pizzatable values (?,?,?,?,? )";
		 PreparedStatement statement= connect.prepareStatement(query);
		 System.out.println("inserted data" +statement);
		 statement.setString(1,dto.getName());
		 statement.setString(2,  dto.getSize());
		 statement.setString(3,  dto.getPaymentmode());
		 statement.setString(4,  dto.getType());
		 statement.setString(5,  dto.getAddress());
		 int i= statement.executeUpdate();
		 System.out.println("insert into :" +i);
		 
		 
		   statement.close();
		 
		return false;
	}

}
