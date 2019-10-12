package com.dev.method;

public class MethodOvrrParent {
	static MethodOvrrChild m=new  MethodOvrrChild();
	public static void main(String[] args) {
		
		int c=m.print(7);
		System.out.println(c);
	}
	public int print(int i) {
		int result=i*i;
		System.out.println(result);
		return result;		
	}
}


	


