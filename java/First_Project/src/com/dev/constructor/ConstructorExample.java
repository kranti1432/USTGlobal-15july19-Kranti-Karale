package com.dev.constructor;

public class ConstructorExample {
	
	public ConstructorExample() {
		System.out.println("construct with no arg");
	}
	
public ConstructorExample(int i,String s) {
		System.out.println("constructor with 2 arg");
	}

public ConstructorExample(int i,String s,double d) {
	System.out.println("Constructor with 3 arg");
}

	public static void main(String[] args) {
		ConstructorExample c1=new ConstructorExample();
		ConstructorExample c2=new ConstructorExample(2,"kk");
		ConstructorExample c3=new ConstructorExample(3,"kkk",8.8);
		
		System.out.println("for no arg: "+c1);                //it gives address of object
		System.out.println("for int and string arg: "+c2);
		System.out.println("for int,string and double arg: "+c3);

	}

}
