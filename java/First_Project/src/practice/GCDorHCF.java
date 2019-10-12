package practice;
import java.util.*;
public class GCDorHCF {

	public static void main(String[] args) {
	System.out.println("enter two numbers");
	int a,b,c=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	for(int i=1;i<=a&&i<=b;i++) {
		if((a%i==0)&&(b%i==0)) {
			c=i;
		}

	}
	System.out.println("gcd is="+c);
	}

}
