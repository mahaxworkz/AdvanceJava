package com.xworkz.wenzio.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.wenzio.dto.wenzioDto;

public class RepoImpl implements Wenrepo {

	@Override
	public boolean save(wenzioDto dto) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/winzio","root","Xworkzodc@123");
		 System.out.println(connect);
		 System.out.println("database connected");
		 String query = "insert into  winziotable values (?,?,?,?,?,?,?,?,?,?)";
		 PreparedStatement statement= connect.prepareStatement(query);
		 System.out.println("inserted data" +statement);
		 statement.setString(1,dto.getName());
		 statement.setString(2,  dto.getEmail() );
		 statement.setString(3,  dto.getNumber() );
		 statement.setString(4,  dto.getPickup() );
		 statement.setString(5,  dto.getDestination() );
		 statement.setString(6,  dto.getGender() );
		 statement.setString(7,  dto.getVehicle() );
		 statement.setString(8,  dto.getTime() );
		 statement.setString(9,  dto.getDate() );
		 statement.setString(10,  dto.getPayment() );
		 int i= statement.executeUpdate();
		 System.out.println("insert into :" +i);
		 
		 
		   statement.close();
		 
		return false;
	}

}
