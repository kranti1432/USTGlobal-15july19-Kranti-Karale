package com.array;

public class CreateArray {

	public static void main(String[] args) {

		int [] intArr;
		char[] charr;          // array declaration in 3 diff manner
		byte byteArr[];       // this type is not commonly used
		int[] intArr2=new int[5];    // decleare and create in single line
		
		int[]intArr3= {11,22,33,44,55};   
		System.out.println(intArr3[4]);
		System.out.println("length of arr3 is= "+intArr3.length);
		
		


		intArr = new int[5];
		charr = new char[5];        // array creation by giving proper size
		byteArr = new byte[5];

		//initilization of array

		intArr[0]=1;
		intArr[1]=2;
		intArr[2]=3;
		intArr[3]=4;
		intArr[4]=5;

		charr[0]='k';
		charr[1]='r';
		charr[2]='a';
		charr[3]='n';
		charr[4]='t';

		byteArr[0]=6;
		byteArr[1]=7;
		byteArr[2]=8;
		byteArr[3]=9;
		byteArr[4]=10;

		//operations on array
		int res=intArr[1]*3;     //this is proper way
		System.out.println(res);

		res=intArr[2]+3;
		System.out.println(res);

		res=intArr[4]-3;
		System.out.println(res);

		res=intArr[3]/2;
		System.out.println(res);

		res=intArr[4]%2;
		System.out.println(res);


	}
}
