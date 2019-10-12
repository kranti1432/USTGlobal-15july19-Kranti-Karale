package com.dev.Inheritance;

public class Father2 extends GrandFather {           //single inheritance grandfather-father

	static Father2 f=new Father2();
	static String name="kranti";

	public void showName() {
		System.out.println(name+" "+f.lastname);
	}

	public static void main(String[] args) {
		f.showName();
		//	System.out.println(name+" "+f.lastname);

	}

}
