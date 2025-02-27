package com.programming.class1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConection {
    
    public static void main(String[] args) {
        
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/sql_concepts?user=root&password=pass@word1";
            
            conn1 = DriverManager.getConnection(dbURL);
            
            if (conn1 != null) {
                System.out.println("connected with conn1");
            }
            
            String dbURL2 = "jdbc:mysql://localhost:3306/sql_concepts";
            String username = "root";
            String password = "pass@word1";
            
            conn2 = DriverManager.getConnection(dbURL2, username, password);
            
            if (conn2 != null) {
                System.out.println("connected with conn2");
            }
            
            // Example usage of conn3, you can update it as per your need
            String dbURL3 = "jdbc:mysql://localhost:3306/sql_concepts";
            conn3 = DriverManager.getConnection(dbURL3, username, password);
            
            if (conn3 != null) {
                System.out.println("connected with conn3");
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
                if (conn2 != null && !conn2.isClosed()) {
                    conn2.close();
                }
                if (conn3 != null && !conn3.isClosed()) {
                    conn3.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
