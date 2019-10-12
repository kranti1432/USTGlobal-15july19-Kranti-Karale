package com.dev.Exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		double d=10.0;
		double d1=0.0;
		System.out.println("Result: "+(d/d1));//infinity
		
		System.out.println("print Statement before");//print
		//s();                                          //exception occur
		t();
		System.out.println("print Statement after");

	}
	
	public static void s() {
		StringBuffer sb=new StringBuffer (-1);//exception at s method

	}
private static void t() {
try {
	s();
}catch(Exception e) {
	System.out.println("exception of c method catch at t method");
}
		
	}
}
