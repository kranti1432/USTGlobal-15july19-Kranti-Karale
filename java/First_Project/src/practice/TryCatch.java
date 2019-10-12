package practice;
import java.util.*;
public class TryCatch {

	public static void main(String[] args) throws Exception {
		System.out.println("enter integer number that u want to be divide by another number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter number to divide 1st number");
		int b=sc.nextInt();
		

try {
	double c=a/b;
	System.out.println("result is : "+c);
	
}
//catch( java.util.InputMismatchException Ie) {
	//throw new Exception();
	//System.out.println("please enter a valid interger number not folat");
//}
	catch(ArithmeticException ae){
System.out.println("number cannot divisible by zero enter another number");
}catch(Exception e) {
	System.out.println("unknown exception");
}
finally {
	System.out.println("operation successful");
}
}
}