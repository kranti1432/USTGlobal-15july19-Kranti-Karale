package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JdbcUpgradation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
	
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("enter the username and password..");
			
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl, user, password) ;
			System.out.println("connection established...");
			System.out.println("**********************");
			
			//Issue SQL query
			
			String query="update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter the email id...");
			pstmt.setString(1,sc.nextLine());
			System.out.println("enter id....");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("enter password....");
			pstmt.setString(3, sc.nextLine());
			
int count=pstmt.executeUpdate();

if(count>0) {
	System.out.println("Query Ok"+count+"Row affected");
}else {
	System.out.println("something went wrong");
}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			}
		}


	}


