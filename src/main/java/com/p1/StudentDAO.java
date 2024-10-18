package com.p1;
//Java Program to fetch All Data Present Inside MySQL DB 

//Importing required classes 
import java.sql.*; 

//Main class 
public class StudentDAO { 

	// Class data members 
	private String driver; 
	private String url; 
	private String userName; 
	private String password; 

	// Setter methods for 
	// Setter Injection 
	public void setDriver(String driver) 
	{ 
		this.driver = driver; 
	} 

	// Setter 
	public void setUrl(String url) { this.url = url; } 

	// Setter 
	public void setUserName(String userName) 
	{ 
		this.userName = userName; 
	} 

	// Setter 
	public void setPassword(String password) 
	{ 
		this.password = password; 
	} 

	// Setter 
	public void selectAllRows() 
		throws ClassNotFoundException, SQLException 
	{ 
		System.out.println("Retrieving all student data.."); 

		// Load driver 
		Class.forName(driver); 

		// Getting a connection 
		Connection con = DriverManager.getConnection( 
			url, userName, password); 

		// Execute query 
		Statement stmt = con.createStatement(); 

		ResultSet rs = stmt.executeQuery( 
			"SELECT * FROM studentdb.hostelstudentinfo"); 

		while (rs.next()) { 
			int studentId = rs.getInt(1); 
			String studentName = rs.getString(2); 
			double hostelFees = rs.getDouble(3); 
			String foodType = rs.getString(4); 

			System.out.println(studentId + " " + studentName 
							+ " " + hostelFees + " "
							+ foodType); 
		} 

		// Closing the connection 
		con.close(); 
	} 
}
