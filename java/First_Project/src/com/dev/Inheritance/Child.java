package com.dev.Inheritance;

public class Child extends Father {            //multilevel inheritance Grandfather-father-child
	static Child c=new Child();
	@Override
	public void printName() {                                     //printName() same method in father,child,son this situation is called methodOveriding
		String name="Kranti";
		System.out.println(name+ " "+super.name+" "+c.lastname);
	}

	public static void main(String[] args) {
	c.printName();

	}

}
