package practice;
import java.util.*;
public class Fibon {

	public static void main(String[] args) {
		System.out.println("enter no");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		int n1=0;
		int n2=1;
		System.out.println(n1);
		for(int i=1;i<=n;i++){
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
