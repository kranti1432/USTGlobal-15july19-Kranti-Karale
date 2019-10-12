package com.dev.constructor;

import com.dev.constructor.*;             //to access method from different package i.e constructor we have to import 
import com.dev.method.MethodExample;
public class MethodAccessInDifferentPackge {

	public static void main(String[] args) {
		int ar=MethodExample.calcArea(9);               
		System.out.println("area of square: "+ar);     //print this statement as well as whatever present in method in that class which present in MethodExample

	}

}
