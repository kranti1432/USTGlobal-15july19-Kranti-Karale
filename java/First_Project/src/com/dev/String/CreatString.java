package com.dev.String;

public class CreatString {

	public static void main(String[] args) {
		String str;
		str="hello";
		
		String str1="java";
		
		String str2=new String("kranti");
		StringBuffer sbu=new StringBuffer("Kranti");      //not allow as StringBuffer sbu="kranti"  as  use must create new
		StringBuilder sbi=new StringBuilder("hello");       ////not allow as StringBuilder sbi="hello"   use must create new

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(sbi+" "+sbu);
		System.out.println(sbi.length());              //it gives length
		System.out.println(sbi.capacity());          //it gives capacity as 16+length
		
		

	}

}
