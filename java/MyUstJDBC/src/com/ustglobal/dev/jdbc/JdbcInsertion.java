package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;





public class JdbcInsertion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
	PreparedStatement pstmt=null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded....");
			
			//Get connection via Driver
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("enter the username and password");
			String user=sc.nextLine();
			String password =sc.nextLine();
			
			DriverManager.getConnection(dbUrl, user,password);
			System.out.println("connection established.....");
			System.out.println("************************");
			
			//Issue the sql query
			String query="INSERT INTO users_info VALUES(?,?,?,?)";
			//pstmt=conn.prepareStatement(query);
			pstmt = conn.prepareStatement(query);

			System.out.println("enter the user id..");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			System.out.println("enter the username...");
			pstmt.setString(2, sc.nextLine());
			
			System.out.println("enter the email.....");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter the password....");
			pstmt.setString(4, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			
			//process the result
			if(count>0) {
				System.out.println("Query Ok"+count+"row affected");
			}else {
				System.out.println("somethimg went wrong");
			}
			
		} catch (Exception e) {
			System.out.println("somethimg went wrong");
			e.printStackTrace();
		}
	}

}
