package com.array;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int r=1;
		
		
		for(int i=n;i>=1;i--)
		{
			r=r*i;
		}
		System.out.println(r);
		
	}
	

}
