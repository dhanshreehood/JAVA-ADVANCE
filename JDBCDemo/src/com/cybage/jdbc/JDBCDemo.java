package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		//load driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		System.out.println("Connection is established");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from demotable");
		
		int id, marks;
		String name, address;
		while(resultSet.next()) {
			id = resultSet.getInt(1);
			name = resultSet.getString(2);
			marks = resultSet.getInt(3);
			address = resultSet.getString(4);
			
			System.out.println("id = " + id
								+ " name = " + name 
								+ " Marks= " + marks
								+ " Address= "+ address);
		}

		}
		catch(Exception exception) {
			exception.printStackTrace();
			}
	}
}