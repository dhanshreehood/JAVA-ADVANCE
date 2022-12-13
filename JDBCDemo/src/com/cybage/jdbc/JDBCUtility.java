package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {

	private static Connection connection = null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
		return connection;
	}
	public static void closeConnection() throws SQLException
	{
		connection.close();
	}

}
