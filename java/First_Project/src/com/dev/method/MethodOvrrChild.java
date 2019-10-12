package com.dev.method;

public class MethodOvrrChild extends MethodOvrrParent{

	public static void main(String[] args) {
		 MethodOvrrChild m1=new  MethodOvrrChild();
		 m1.print(1);
}
@Override

public int print(int i) {
int k=super.print(9);
return k;
}
}