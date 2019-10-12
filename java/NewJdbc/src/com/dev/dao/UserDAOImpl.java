package com.dev.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dev.beans.User;

public class UserDAOImpl implements UserDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public static final String DBURL="jdbc:mysql://localhost:3306/"
			+ "ust_ty_db?user=root&password=kranti$k143";
	public UserDAOImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public User getInfo(int userid) {
		String query = "SELECT * FROM users_info where userid=?";
		User user = new User();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
			}
			 return user;
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
			if(pstmt!=null) {
				try {
					pstmt.close();
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
		
		return null;
	}

}