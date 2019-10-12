package com.dev.method;

public class MethodExample {
	static int j=0;            //static variable of class can be accessed in any method

	static MethodExample m2=new MethodExample();      //static object creation outof main method can be accesed everywhere

	public static void main(String[] args) {
		int area=calcArea(6);                          //static method no need to create object
		System.out.println("calling static method without object creation, area= "+area);

		MethodExample m1=new MethodExample();         //non-static method we have to create object
		int area2=m1.areaRec(2, 3);
		System.out.println("calling non static method with object creation, area= "+area2);

		int r=m2.areaRec(3,3);

		j=calcArea(3);     //can access static member in class
		System.out.println("using static member of class calcAra ="+j);


	}
	public static int calcArea(int side) {        //static method static keyword
		int result=side*side;
		int n=m2.areaRec(2,4);           //using static object creation outside main method
		System.out.println("using object created outside main= "+n);
		return result;

	}
	public int areaRec(int length,int width) {             //non static method no static keyword
		int area1=length*width;
		return area1;
	}
}
