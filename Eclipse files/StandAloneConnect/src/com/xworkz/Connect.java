package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Eclipse", "root",
				"Xworkzodc@123");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM eclipse.amusementparktable ");
		while (result.next()) {
			System.out.println(result.getString(3));
		}
		connection.close();
	}
}
