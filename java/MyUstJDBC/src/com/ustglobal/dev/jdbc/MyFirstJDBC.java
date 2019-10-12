package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//Load the driver
			java.sql.Driver div= new Driver();
			DriverManager.registerDriver(div);
			System.out.println("driver loaded .....");
			
			//get connection via Driver
			
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=kranti$k143";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connect established......");
			System.out.println("***********************************");
			
			//issue SQL query via connection
			String query="select * from users_info";
			//String query="select * from users_info where userid=111";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);  
//			System.out.println(rs);
//			System.out.println("query execute");
			
			//Process the result returned by Sql query
			
			while(rs.next()) {
				int userid=rs.getInt("userid");
				String username=rs.getString("username");
				String email=rs.getString("email");
				String password=rs.getString("password");
				
				System.out.println("userid: "+userid);
				System.out.println("username: "+username);
				System.out.println("email: "+email);
				System.out.println("password: "+password);
				System.out.println("-------------------------------------------");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
