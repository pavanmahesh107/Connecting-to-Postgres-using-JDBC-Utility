package com.postgresssql;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_Value {
	
	public static void main(String[] args) {
		
		
		Connection connection = null;
		
		Statement statement = null;
		
		ConnectDB obj_ConnectDB = new ConnectDB();
		
		connection = obj_ConnectDB.get_connection();
		
		
		try {
			
			String query = "insert into employee(name,address) values('pavan','USA') ";
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Value inserted Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
