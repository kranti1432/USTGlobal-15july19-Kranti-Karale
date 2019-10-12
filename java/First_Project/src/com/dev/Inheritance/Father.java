package com.dev.Inheritance;

public class Father extends GrandFather {      //single inheritance grandfather-father

	static Father f=new Father();
	String name="Manchak";
@Override
	public void printName() {                                   //printName() same method in father,child,son this situation is called methodOveriding
		System.out.println(name +" "+super.name+" "+f.lastname);
		super.printName();              //from grandfather
	}
	public static void main(String[] args) {
		f.printName();

	}

}
