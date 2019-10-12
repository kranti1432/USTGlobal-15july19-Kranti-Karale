package com.dev.Polymorphism;

public class GrandFather {
	static GrandFather g=new GrandFather();
	public void add(int a,int b) {
		System.out.println("this is addition");
	}
	
	
	
	public void add(int a,int b,int c,int d) {
		System.out.println("this is multiplication");
	}
	public void add(int a,int b,int c) {
		System.out.println("this is substraction");
	}

	public static void main(String[] args) {
	g.add(3, 5);
	g.add(3, 5, 8);
	g.add(2, 4, 5, 7);

	}

}
