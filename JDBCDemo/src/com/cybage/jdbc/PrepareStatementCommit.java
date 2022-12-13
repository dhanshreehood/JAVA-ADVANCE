package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PrepareStatementCommit {

	public static void main(String[] args) {
		try(PreparedStatement pStatement = connection.prepareStatement("insert into demotable (id, name, marks, address) values(?,?,?,?)");) {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
			Connection connection=JDBCUtility.getConnection();
			System.out.println("Connection is established");
			PreparedStatement pStatement1 = connection.prepareStatement("insert into demotable (id, name, marks, address) values(?,?,?,?)");
			pStatement1.setInt(1, 3);
			pStatement1.setString(2, "Shreya ghosla");
			pStatement1.setInt(3, 87);
			pStatement1.setString(4, "Pune");
			pStatement1.executeUpdate();	
			
			//next record
			pStatement1.setInt(1, 2);
			pStatement1.setString(2, "Riya Mishra");
			pStatement1.setInt(3, 89);
			pStatement1.setString(4, "Pune");
			pStatement1.executeUpdate();		
			}

			
			catch(Exception e) {
				e.printStackTrace();
				}


	}

}