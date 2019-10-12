package com.dev.constructor;

public class ConstructorOverloadingSuper {

	public static void main(String[] args) {
		

	}
public  ConstructorOverloadingSuper() {
	System.out.println("zero arg const from super");
}
public ConstructorOverloadingSuper(int i) {
	System.out.println("int arg const from super");
}
public ConstructorOverloadingSuper(String s) {
	System.out.println("string arg const from super");
}
public ConstructorOverloadingSuper(int i,String s) {
	System.out.println("int and string arg const from super");
}
public ConstructorOverloadingSuper(String s,int i) {
	System.out.println("string and int arg const from super");
}
}
