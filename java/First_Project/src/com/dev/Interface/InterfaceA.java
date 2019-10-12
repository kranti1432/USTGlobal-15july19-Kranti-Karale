package com.dev.Interface;


@FunctionalInterface                 // to remain this interface as functional
public interface InterfaceA extends Cloneable{

	void display();                 //by default it is abstract method
	//void show();                  //as a functional cant declare more than one abstrct method
	
	
	 static void print() {
		 System.out.println("A");
	 }
	 

	 static void print1() {
		 System.out.println("A");
	 }
}
