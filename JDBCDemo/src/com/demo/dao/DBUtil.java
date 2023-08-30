package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
     static Connection conn=null;
     public static Connection getMyConnection() throws SQLException {
    	 if(conn==null) {
    		 
    		 //DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
    		 DriverManager.registerDriver(new 
    				            com.mysql.cj.jdbc.Driver());
 			//step2 ---get connection
 			//conn=DriverManager.getConnection("jdbc:derby:C:\\mydata\\firstdb");
    		 conn=DriverManager.getConnection(
    				  "jdbc:mysql://localhost:3306/test", "root","root123");
 			//conn.setAutoCommit(false);
 			if(conn!=null) {
 				System.out.println("connection done");
 				return conn;
 			}
 			else {
 				System.out.println("not done");
 			}
    	  
    	 }
    	 return  conn;
     }
     
     public static void closeMyConnection() {
    	 if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     }
     
}
