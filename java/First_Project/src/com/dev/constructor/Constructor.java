package com.dev.constructor;

public class Constructor {

	
		public Constructor(int i) {                          //int arg constr
		
System.out.println("this constuct with int argu");
	}
		public Constructor(String s) {                                //string arg constru
			System.out.println("this const with String arg");
			
		}
		
		public Constructor(String s,int i) {                                //string arg constru
			System.out.println("this const with String and int arg");
			
		}
		
		//constructor overloading can be same name same arg but argument order is different (string, int).....(int,string)
		
		public Constructor(int i,String s) {                                //string arg constru
			System.out.println("this const with int and String arg");
			
		}
		
		public Constructor() {                                       //no arg
			System.out.println("this is no Arg constructor");
		}
		
		
		public static void main(String[] args) {
			Constructor C1=new Constructor(2);         //int arg constr
			Constructor C2=new Constructor("k");      //string arg constru
			Constructor C4=new Constructor("kk",8);    //string 1st and then int
			Constructor C5=new Constructor(7,"u");       //int 1st and then string
			Constructor C3=new Constructor();         //no arg
			
		}
}
