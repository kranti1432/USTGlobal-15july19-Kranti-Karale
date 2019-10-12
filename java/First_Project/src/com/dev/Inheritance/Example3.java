package com.dev.Inheritance;

public class Example3 extends Example2{
	static Example3 e3=new Example3();

	public static void main(String[] args) {
	e3.printName();

	}
public void printName() {
	System.out.println(super.name+" "+super.lastname);   //we can also give e3.lastname
} 
}
