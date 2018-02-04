package com.aws.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aws.dev.domain.User;


public class GetAwsUsersDao {
	
	public List<User> getAwsUsers(){
		
		Connection c = null;
		List<User> userList = new ArrayList<User>();
		try {
			c = createConnection();
			String sql = "select * from awsusers;";
			Statement stmt = c.createStatement();

			ResultSet result = stmt.executeQuery(sql);
			System.out.println("ID \t First Name \t Last Name \t");
			System.out.println("** \t ********** \t ********* \t");
			
			
			while (result.next()) {
				System.out.println(result.getInt("id") + "    \t"
						+ result.getString("FName") + "      \t"
						+ result.getString("Lname"));
				User user = new User();
				user.setFname(result.getString("FName"));
				user.setLname(result.getString("Lname"));
				user.setLocation(result.getString("Location"));
				user.setSkillSet(result.getString("SkillSet"));
				user.setHobbies(result.getString("Hobbies"));
				userList.add(user);
			}
			result.close();
			stmt.close();
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return userList;
	}

	
public User getAwsUser(String fName){
		
		Connection conn = null;
		User user = new User();
		try {
			conn = createConnection();
			PreparedStatement ptmt = conn.prepareStatement("select * from awsusers where fname like (?)");
			ptmt.setString(1, fName);
			ResultSet result = ptmt.executeQuery();
			System.out.println("ID \t First Name \t Last Name \t");
			System.out.println("** \t ********** \t ********* \t");
			
			
			while (result.next()) {
				
				
				user.setFname(result.getString("FName"));
				user.setLname(result.getString("Lname"));
				user.setLocation(result.getString("Location"));
				user.setSkillSet(result.getString("SkillSet"));
				user.setHobbies(result.getString("Hobbies"));
			}
			result.close();
			ptmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return user;
	}

	private Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Connection c;
		Class.forName("org.postgresql.Driver");
		c = DriverManager
				.getConnection(
						"jdbc:postgresql://devawsrdsinstance.cshuddzair5g.us-east-2.rds.amazonaws.com:5432/devrdsdb",
						"dev2207", "Devvanitha123");
		return c;
	}
		
}