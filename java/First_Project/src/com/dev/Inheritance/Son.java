package com.dev.Inheritance;

public class Son extends Father {

	static Son s=new Son();
	@Override
	public void printName() {                                      //printName() same method in father,child,son this situation is called methodOveriding
		String name="Deepak";
		System.out.println(name+" "+super.name+" "+s.lastname);
		super.printName();             //it calls printName method from super class and execute it
	}

	public static void main(String[] args) {

		s.printName();
	}

}
