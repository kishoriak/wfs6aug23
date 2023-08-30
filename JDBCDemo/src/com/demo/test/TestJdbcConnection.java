package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcConnection {
	public static void main(String[] args) {
		
		try {
			//step 1---register driver
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			//step2 ---get connection
			Connection conn=DriverManager.getConnection("jdbc:derby:C:\\mydata\\firstdb");
			if(conn!=null) {
				System.out.println("connection done");
			}
			else {
				System.out.println("not done");
			}
			//step3 --- create a statement
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("empid : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Sal : "+rs.getInt(3));
			}
			
			Scanner sc=new Scanner(System.in);
			
			PreparedStatement ps=conn.prepareStatement("select * from employee where id=?");
			System.out.println("enetr id for search");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ResultSet rs1=ps.executeQuery();
			if(rs1.next()) {
				System.out.println("empid : "+rs1.getInt(1)+" Name : "+rs1.getString(2)+" Sal : "+rs1.getInt(3));
			}
			//ps.setString(2, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}

