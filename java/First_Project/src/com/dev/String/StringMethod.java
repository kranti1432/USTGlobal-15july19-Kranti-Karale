package com.dev.String;

public class StringMethod {

	public static void main(String[] args) {
		String str="Some_string";              //capital s comment for understading equal method
		String str1="some_string";            //small s

		int length=str.length();
		System.out.println("output for length(): "+length);

		char [] ch=str.toCharArray();          // this method create new array of character
		System.out.println("output for toCharArray() : "+ch[5]);

		char c=str.charAt(7);                  //returns the value at specified index and argument is int and range is 0 to length-1
		System.out.println("output for charAt() : "+c);

		boolean b=str.equals(str1);       //3 condition should satisfy same data type,not null,character sequce same
		System.out.println("output for equals(): "+b);

		boolean b1=str.equalsIgnoreCase(str1);  //case insensitive it dose not considerd 3rd condition of equals in above comment
		System.out.println("output for equalsIgnorecase(): "+b1);
		
		boolean b3=str.contains("a");              //check whether cha present or not
		System.out.println("output for contains(): "+b3);
		
		String rep=str.replace("s", "K");   //replace string with new string
		System.out.println("output for replace(): "+rep);
		
		int f=str.indexOf('S');       //check 1st occurence of character    
		System.out.println("output for indexof(): "+f);
		
		String s=str.toUpperCase();         //covert string to caital
		System.out.println("output for touppercsae(): "+s);
		
		String s1=str.toLowerCase();         //covert string to small lettrs
		System.out.println("output for tolowercsae(): "+s1);
		
		s1=str1.substring(7);
		System.out.println("output for substring(int): "+s1);
		
		s1=str1.substring(3,7);
		System.out.println("output for substring(int,int): "+s1);
		
		
		
		
	}

}
