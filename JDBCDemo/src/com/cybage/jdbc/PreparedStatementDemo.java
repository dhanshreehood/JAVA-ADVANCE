package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Date;

public class PreparedStatementDemo {
	@SuppressWarnings("Deprication")
	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
			Connection connection=JDBCUtility.getConnection();
			System.out.println("Connection is established");
			PreparedStatement pStatement = connection.prepareStatement("insert into demotable (id, name, marks, address) values(?,?,?,?)");
			pStatement.setInt(1, 3);
			pStatement.setString(2, "Shreya ghosla");
			pStatement.setInt(3, 87);
			pStatement.setString(4, "Pune");
			pStatement.executeUpdate();	
			
			//next record
			pStatement.setInt(1, 2);
			pStatement.setString(2, "Riya Mishra");
			pStatement.setInt(3, 89);
			pStatement.setString(4, "Pune");
			pStatement.executeUpdate();		
			}

			
			catch(Exception e) {
				e.printStackTrace();
				}


	}

}