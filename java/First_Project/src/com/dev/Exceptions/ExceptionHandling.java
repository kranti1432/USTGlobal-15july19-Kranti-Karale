package com.dev.Exceptions;

public class ExceptionHandling {



	private static void s() {
		StringBuffer sb=new StringBuffer(-1);
	}
	public static void main(String[] args) {
		try {
			s();
		}catch(Exception e) {
			System.out.println("exception occured");
			//e.printStackTrace();

		}finally {
			System.out.println("this is finally block");
		}
		System.out.println(" code after ecxeption");

	}

}
