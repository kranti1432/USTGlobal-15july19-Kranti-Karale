package com.dev.Exceptions;

public class ExceptionHand1 {

	public static void s() throws CustomException{
	//int i=1;
	int i=-1;
	if(i<0) {
		throw new CustomException();
	}
	StringBuffer s1=new StringBuffer(i);
}

public static void main(String[] args) throws CustomException{
	s();
	System.out.println("no exception for s");
	
}
}
