package com.aws.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class GetAwsUsers {
	public static void main(String args[]) {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection(
							"jdbc:postgresql://devawsrdsinstance.cshuddzair5g.us-east-2.rds.amazonaws.com:5432/devrdsdb",
							"dev2207", "Devvanitha123");
			String sql = "select * from awsusers;";
			Statement stmt = c.createStatement();

			ResultSet result = stmt.executeQuery(sql);
			System.out.println("ID \t First Name \t Last Name \t");
			System.out.println("** \t ********** \t ********* \t");
			while (result.next()) {
				System.out.println(result.getInt("id") + "    \t"
						+ result.getString("FName") + "      \t"
						+ result.getString("Lname"));
			}
			result.close();
			stmt.close();
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}
}