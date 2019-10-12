package com.dev.Inheritance;

public class GrandFather {

	static GrandFather g=new GrandFather();
	String lastname="karale";
    String name="tukaram";
	public static void main(String[] args) {
		g.printName();

	}
	public void printName() {                                             //printName() same method in father,child,son this situation is called methodOveriding

		System.out.println(name +" "+g.lastname);
		
	}

}
