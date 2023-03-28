package com.xworkz.valentine.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateDemoRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Eclipse", "root","Xworkzodc@123");
			String query="update valentine_table set places='Shimoga' where name='Rama';";
			Statement statement= connection.createStatement();
			int rowsAffected= statement.executeUpdate(query);
			System.out.println("rowsAffected : "+rowsAffected);
			connection.close();
		} catch (ClassNotFoundException ce) {
			System.out.println("Driver class not found " + ce.getMessage());
		}catch(SQLException se) {
			System.out.println("Connection cannot build "+se.getMessage());
		}
	}

}
