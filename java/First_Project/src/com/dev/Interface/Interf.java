package com.dev.Interface;

public class Interf implements MainInter{
static Interf i=new Interf();
	public static void main(String[] args) {
		MainInter.print();         //static method 
		i.display();

	}

	@Override
	public void display() {
		System.out.println("display method of interface");
		
	}
	

}
