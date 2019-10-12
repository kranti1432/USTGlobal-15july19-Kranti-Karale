package com.dev.constructor;

public class ConstructorOverloadingSub extends ConstructorOverloadingSuper {

	public static void main(String[] args) {
		ConstructorOverloadingSub c1=new ConstructorOverloadingSub();
		ConstructorOverloadingSub c2=new ConstructorOverloadingSub(6);
		ConstructorOverloadingSub c3=new ConstructorOverloadingSub(8,"ii");
		ConstructorOverloadingSub c4=new ConstructorOverloadingSub("uu",9);
		ConstructorOverloadingSub c5=new ConstructorOverloadingSub("jj");
		

	}
public ConstructorOverloadingSub() {
	super();
	
}
public ConstructorOverloadingSub(int i) {
	super(3);
	
}
public ConstructorOverloadingSub(String s) {
	super("kkkk");
	
}
public ConstructorOverloadingSub(int i,String s) {
	super(6,"lll");
	
}
public ConstructorOverloadingSub(String s,int i) {
	super("lll",0);
	
}
}
