package com.dev.Exceptions;

public class CustomException extends Exception{

	public CustomException() {

		System.out.println("coustom exception");
	}

	public CustomException(int i) {
		System.out.println("exception occured at integere");
	}

	public CustomException(String s) {
		System.out.println("exception occured at String");
	}
	//	@Override
	//	public String getMessage(){
	//		return "this is for getmessgae()";
	//	}

	@Override
	public String getLocalizedMessage() {
		return " this is localizedMessage";
	}


}
