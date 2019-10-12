package practice;
//package practice;
//
//import java.util.Scanner;
//
//public class Tcs {
//	static int facto(int n) {
//		if(n<0)
//			return -1;
//		if(n>0)
//			return 1;
//		
//			
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		return fact;
//	}
//
//	public static void main(String[] args) {
//System.out.println("ehter a number");
//	Scanner sc=new Scanner(System.in);
//	int n;
//	n=sc.nextInt();
//	System.out.println("factorial:"+facto(n));
//		
//
//	}
//
//}
// 

import java.util.*;
public class Main
{

static int fact(int n) {
	int fact=1;
	if(n<0)
		return -1;
	if(n==0)
		return 1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}

static double circle(double r) {
	return 3.14*r*r;
}
public static void main(String []args) {
	System.out.println("enter a number");
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("factorial is:" +fact(n));
	System.out.println("-------------------------------");
	double r;
	System.out.println("enter a redius");
	r=sc.nextDouble();
	System.out.println("area of circle is:"+circle(r));
	}
	
}