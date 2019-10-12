package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBcRetrival {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		ResultSet rs=null;
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");

			//get connection
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			String filePath="C:\\Users\\Admin\\Desktop\\db.properties";

			FileReader reader=new FileReader(filePath);
			Properties prop=new Properties();
			prop.load(reader);

			conn=DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection established...");
			System.out.println("******************************");

			//Issue Sql query

			String query="select* from users_info where userid=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter id....");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			rs=pstmt.executeQuery();

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

		}sc.close();

	}

}
