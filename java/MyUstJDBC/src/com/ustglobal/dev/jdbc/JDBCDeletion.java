package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeletion {

	public static void main(String[] args) {
		Connection conn=null;
	PreparedStatement	pstmt=null;
	Scanner sc=new Scanner(System.in);
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");
			
			//Get connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			String filePath="C:\\Users\\Admin\\Desktop\\db.properties";
			
			FileReader reader=new FileReader(filePath);
			Properties prop=new Properties();
			prop.load(reader);
			
			conn=DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection established...");
			System.out.println("******************************");
			
			//Issue Sql query
			
			String query="delete from users_info where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter id....");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter password....");
			pstmt.setString(2, sc.nextLine());
			
int count=pstmt.executeUpdate();

if(count>0) {
	System.out.println("Query Ok "+count+" Row affected");
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
			
			}sc.close();

	}

}
