package com.programming.class1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementAPI {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mysql://localhost:3306/sql_concepts?user=root&password=pass@word1";
		
		try {
			conn = DriverManager.getConnection(dbURL);
			String sql = "update employee set first_name=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"PQR");
			pstmt.setInt(2, 111);
			int rows = pstmt.executeUpdate();
			String selectSQL = "select * from employee where id = ?";
			pstmt = conn.prepareStatement(selectSQL);
			pstmt.setInt(1, 111);
			rs = pstmt.executeQuery();
			System.out.println("ID\tFirst Name\tLast Name\tDesignantion");
			System.out.println("=======================================");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" +
						 rs.getString(3) + "\t" + rs.getString(4));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(null != conn) {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
			}
		}
	}
}
}


