package com.dev.musicPlayer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.*;

public class Player1 {

	public static void main(String[] args) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.println("press 1 to- play a song");
		System.out.println("press 2 to-search a song");
		System.out.println("pree 3 to-show all songs");
		System.out.println("press 4 to-operate on songs database");

		try {
			// load the server
			Class.forName("com.mysql.jdbc.Driver");
			// get connection
			String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
			String filePath = "C:\\Users\\Admin\\Desktop\\db.properties";

			FileReader reader = new FileReader(filePath);
			Properties prop = new Properties();
			prop.load(reader);

			conn = DriverManager.getConnection(dbUrl, prop);
			// System.out.println("connection established...");
			// System.out.println("******************************");

			int a = sc.nextInt();

			if (a == 1) {
				// System.out.println("enter song id....");
				// pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
				//

				System.out.println("press A to-play all the songs");
				System.out.println("press B to-play songs randomly");
				System.out.println("press C to-play a perticular songs");

				char c = sc.next().charAt(0);
				switch (c) {
				case 'A':
					String query1 = "select*from musicfiles";
					pstmt = conn.prepareStatement(query1);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getString("song_title"));
					}
					break;
				case 'B':
					String query2 = "select * from musicfiles order by rand() limit 1 ";
					pstmt = conn.prepareStatement(query2);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.print("play:" + rs.getString("song_title"));
						System.out.print("   ablum name: " + rs.getString("album_name"));
						System.out.print("   discription : " + rs.getString("discription"));
						System.out.println("   artist name: " + rs.getString("artist_name"));
					}
					break;
				case 'C':
					try {
						String query3 = "select * from musicfiles where songid=?";
						System.out.println("enter a songid");
						pstmt = conn.prepareStatement(query3);
						pstmt.setInt(1, sc.nextInt());
						rs = pstmt.executeQuery();
						while (rs.next()) {
							System.out.println(rs.getString("song_title"));
						}
					} catch (Exception e) {
						System.out.println("something went wrong");
					}

				}

			}

			if (a == 2) {

				String query4 = "select * from musicfiles where songid=?";
				System.out.println("enter a songid");
				pstmt = conn.prepareStatement(query4);
				pstmt.setInt(1, sc.nextInt());

				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print("play:" + rs.getString("song_title"));
					System.out.println("   ablum name: " + rs.getString("album_name"));
				}
			}

			if (a == 3) {
				String query5 = "select *from musicfiles";
				pstmt = conn.prepareStatement(query5);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print("play:" + rs.getString("song_title"));
					System.out.print("   ablum name: " + rs.getString("album_name"));
					System.out.print("   discription : " + rs.getString("discription"));
					System.out.println("   artist name: " + rs.getString("artist_name"));
				}
			}
			if (a == 4) {
				System.out.println("PRESS A to -add a song");
				System.out.println("PRESS B to -edit an exsisting song");
				System.out.println("PRESS C to -delete exsisting song");

				char c1 = sc.next().charAt(0);
				switch (c1) {
				case 'A':
					String query5 = "INSERT INTO musicfiles VALUES(?,?,?,?,?,?)";
					pstmt = conn.prepareStatement(query5);
					System.out.println("enter the song id..");
					pstmt.setInt(1, sc.nextInt());
					sc.nextLine();
					System.out.println("enter the song title...");
					pstmt.setString(2, sc.nextLine());
					System.out.println("enter the artist name.....");
					pstmt.setString(3, sc.nextLine());
					System.out.println("enter the album name ....");
					pstmt.setString(4, sc.nextLine());
					System.out.println("enter the file location ....");
					pstmt.setString(5, sc.nextLine());
					System.out.println("enter the description ....");
					pstmt.setString(6, sc.nextLine());
					int count = pstmt.executeUpdate();

					if (count > 0) {
						System.out.println("Query Ok" + count + "row affected");
					} else {
						System.out.println("somethimg went wrong");
					}
					break;
				case 'B':
					String query6 = "update musicfiles set song_title=? ";
					pstmt = conn.prepareStatement(query6);
//					System.out.println("enter songid....");
//					pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
					System.out.println("enter the song title...");
					pstmt.setString(1, sc.nextLine());

					int count1 = pstmt.executeUpdate();

					if (count1 > 0) {
						System.out.println("Query Ok" + count1 + "row affected");
					} else {
						System.out.println("somethimg went wrong");
					}
					break;
				case 'C':
					String query7 = "delete from musicfiles where songid=? ";
					pstmt = conn.prepareStatement(query7);
					System.out.println("enter the songid...");
					// pstmt.setString(1,sc.nextLine());
					pstmt.setInt(1, sc.nextInt());
					int count2 = pstmt.executeUpdate();

					if (count2 > 0) {
						System.out.println("Query Ok" + count2 + "row affected");
					} else {
						System.out.println("somethimg went wrong");
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
