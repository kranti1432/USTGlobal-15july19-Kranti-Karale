package com.dev.MethodOvreloading;

public class MethodOverloadig {
	static MethodOverloadig m=new MethodOverloadig();

public void print() {
	System.out.println("method with zero arg");
		
	}
public int print(int i) {
	System.out.println("this method with int arg");
	return 1;
}
public String print(String s) {
	System.out.println("this method with string arg");
	return "kk";
}

	public static void main(String[] args) {

		m.print();
}
}