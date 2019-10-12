package practice;
import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
	System.out.println("enter a number");
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
//	for(int i=2;i<=n/2;i++) {
//		if(n%i==0) {
//			break;
//		}
		if(n%2==0) {
			System.out.println("number is not prime");
		}else {
			System.out.println("number is prime");
		}
		
	//}
	
	
}
}

