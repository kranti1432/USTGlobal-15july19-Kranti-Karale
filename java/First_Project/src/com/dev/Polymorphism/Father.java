package com.dev.Polymorphism;

public class Father extends GrandFather{
	static Father f= new Father();
	
	@Override
	public void add(int a,int b) {
		super.add(1,2,3);
	}

	public static void main(String[] args) {
	f.add(3, 5);
	f.add(4, 6, 8, 4);
	f.add(3, 5, 8);

	}

}
