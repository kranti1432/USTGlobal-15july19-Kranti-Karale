package com.ustglobal.bean;

public class Song {

	private int song_id;
	private String song_title;
	private String file_location;
	private String ablum_name;
	private String artist_name;
	private String discription;
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	public String getSong_title() {
		return song_title;
	}
	public void setSong_title(String song_title) {
		this.song_title = song_title;
	}
	public String getFile_location() {
		return file_location;
	}
	public void setFile_location(String file_location) {
		this.file_location = file_location;
	}
	public String getAblum_name() {
		return ablum_name;
	}
	public void setAblum_name(String ablum_name) {
		this.ablum_name = ablum_name;
	}
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
}
