package com.dev.Exceptions;

//public class ThrowExcep {

//	public static void main(String[] args) throws Exception,NegativeArraySizeException {
//
//		s1();
//		System.out.println("code After the exception");
//	}
//
//	private static void s1() throws Exception,NegativeArraySizeException {
//		StringBuffer sb1=new StringBuffer(-1);
//	}
//}




public  class ThrowExcep{
	public static void main(String[] args) throws CustomException {
		//		try {
		//			divide(10,0);
		//		}catch(Exception e){
		//			//throw new CustomException();    //exception occured no arugument  @CustomException class
		//			 new CustomException(9);  //exception occured at integer @CustomException class
		//			//throw new CustomException("kranti"); //exception occured at string @CustomException class
		//		}

		try {
			int res=divide(10,0);
			s();
			System.out.println("no exception for s() ");
			//int res=divide(10,2);
			System.out.println("no exception for divide() ");
		}
		//		catch(Exception e) {        //cant before child should be at last exceptipon class as Exception is parent of all exception class
		//			System.out.println("exception occured");
		//			}
		catch(NegativeArraySizeException e) {
			System.err.println(" NegativeArraySize exception is caught in catch block");
			System.err.println("getMessage(): "+e.getMessage());
			e.printStackTrace();

		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is caught in catch block");
			System.err.println("getMessage(): " +e.getMessage());
			e.printStackTrace();
		}


	}

	public static int divide (int i,int j) {
		int res=i/j;
		System.out.println(res);

		return 1;
	}
	public static void s() {
		//StringBuffer s1=new StringBuffer(1);
		StringBuffer s1=new StringBuffer(-1);
	}

}
