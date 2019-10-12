package com.dev.Inheritance;

public class Example1 {
	static Example1 e1=new Example1();
	static String name="kranti";
	String lastname="karale";

	public static void main(String[] args) {
e1.printName();

	}

	public void printName() {
		System.out.println(name+" "+e1.lastname);
	}
}
