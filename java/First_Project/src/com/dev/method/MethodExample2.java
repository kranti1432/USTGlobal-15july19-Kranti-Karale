package com.dev.method;

public class MethodExample2 {

	public static void main(String[] args) {
		int area=MethodExample.calcArea(9);      //access static method in another class by classname.methodname
		System.out.println("calling static method without object creation, squarearea= "+area);
		
		MethodExample m1=new MethodExample();
		int  area2=m1.areaRec(3,8);
		System.out.println("calling non static method with object creation, rectarea= "+area2);

	}

}
