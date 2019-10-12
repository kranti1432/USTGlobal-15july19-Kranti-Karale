package com.dev.Encapsulation;

public class Student {
	private int regno;
	private String name;
	private String email;
	private String password;

	
	public int getRegno() {                       // this all methods generate
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public static void main(String[] args) {
//		
//
//	}

}
