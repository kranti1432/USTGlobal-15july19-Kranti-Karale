package com.dev.Inheritance;
//_____________________________________CONSTRUCTOR OVERLOADING____________
public class SuperClass {

	public static void main(String[] args) {
		

	}
public SuperClass() {
	System.out.println("this const with zero arg from super");
}
public SuperClass(String s) {
	System.out.println("this const with string arg from super");
}
public SuperClass(int i) {
	System.out.println("this const with int arg from super");
}
public SuperClass(int i,String s) {
	System.out.println("this const with int and string arg from super");
}
public SuperClass(String s,int i) {
	System.out.println("this const with string and int arg from super");
}
}
