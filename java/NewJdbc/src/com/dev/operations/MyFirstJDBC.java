package com.dev.operations;

import java.util.Scanner;

import com.dev.beans.User;
import com.dev.services.UserServices;
import com.dev.services.UserServicesImpl;

public class MyFirstJDBC {

	public static void main(String[] args) {
		UserServices us = new UserServicesImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id...");
		int userid = Integer.parseInt(sc.nextLine());
		User user = us.getInfo(userid);
		System.out.println(user);

	}

}