package com.dev.Inheritance;

public class Example2 extends Example1 {
	static Example2 e2=new Example2();

	public static void main(String[] args) {
		e2.printName();

	}
public void printName() {
	System.out.println(super.name+" "+super.lastname);        //we can also give e2.lastname
}
}
