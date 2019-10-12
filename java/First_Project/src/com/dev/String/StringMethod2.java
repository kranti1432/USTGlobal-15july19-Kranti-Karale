package com.dev.String;

public class StringMethod2 {

	public static void main(String[] args) {
		String str="kranti_karale";
		String str1="KraNTI_kaRaLe";
		
		int length=str.length();           //return type int and gives length of string
		System.out.println("output for length(): "+length); 
		
		char [] ch1=str1.toCharArray();    //return type is char and gives char array of string
		System.out.println("output for toCharArray(): "+ch1);
		
		char ch=str.charAt(5);           //returns the value at specified index and argument is integer range between 0 to length-1
		System.out.println("output for charAt(): "+ch);
		
		boolean b=str.equals(str1); //returns true or false on 3 condition
		System.out.println("output for equals(): "+b);
		
		boolean b1=str.equalsIgnoreCase(str1);     //ignore case sensitivity
System.out.println("output for equalsIgnoreCase(): "+b1);


	}

}
