package com.programming.class1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCoperations {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
		}	
}
	
public static void main(String[] args) throws SQLException {
	Connection conn = null ;
	Statement stmt = null;
	ResultSet rs = null;
	
	String dbURL = "jdbc:mysql://localhost:3306/sql_concepts?user=root&password=pass@word1";
	
	try {
		conn = DriverManager.getConnection(dbURL);
//		conn.setAutoCommit(false);
		stmt = conn.createStatement();
		
		int i = 0;
//		stmt = conn.createStatement();
//		String dropSQL = "DROP TABLE EMPLOYEES";
//		int i = stmt.executeUpdate(dropSQL);
//		if(i == 0) System.out.println("employees table dropped");
//		else System.out.println("employees table don't exist in sql_concepts DB");
		
		String createQuery = "create table employee(" + 
		"ID int not null," +
				"FIRST_NAME varchar(200)," +
		"last_name varchar(200)," +
				"designation varchar(200))";
		
		i = stmt.executeUpdate(createQuery);
		if(i == 0) System.out.println("table created successfully");
		else System.out.println("table not created");
		
		String insertQuery = "insert into employee values" + "(111, 'A','B','CEO')";
		i = stmt.executeUpdate(insertQuery);
		if(i != 0)System.out.println("row inserted successfully");
		else System.out.println("table not inserted");
		
		conn.setAutoCommit(false);
		conn.commit();
		
		String selectQUERY = "SELECT * from employee";
		rs = stmt.executeQuery(selectQUERY);
		while(rs.next()) {
			System.out.println("ID:" + rs.getInt(1));
			System.out.println("First Name:" + rs.getInt(2));
			System.out.println("Last Name:" + rs.getInt(3));
			System.out.println("Designantion:" + rs.getInt(4));			
		}
		
		String updateSQL = "update employee set first_name = 'X'," +
		"last_name = 'Y' where designantion='CEO'";
		i = stmt.executeUpdate(updateSQL);
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		if(conn != null && !conn.isClosed()) {
			conn.close();
		}
	}
}
}
