package com.postgresssql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read_Value {
	
	public static void main(String[] args) {
		Connection connection = null;
		
		Statement statement = null;
		
		ResultSet rs = null;
		
		ConnectDB obj_ConnectDB = new ConnectDB();
		
		connection = obj_ConnectDB.get_connection();
		
		
		try {
			
			String query = "select * from employee";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print(rs.getString(2));
				System.out.println(rs.getString(3));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
