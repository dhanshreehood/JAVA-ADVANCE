package com.cybage.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = JDBCUtility.getConnection();
		System.out.println("coonection is established");
		try(CallableStatement cStatement=connection.prepareCall("{call getName(?,?)}"))
		{
			cStatement.setInt(1, 2);
			cStatement.registerOutParameter(2, Types.VARCHAR);
			cStatement.execute();
			String name=cStatement.getString(2);
			System.out.println(name);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
