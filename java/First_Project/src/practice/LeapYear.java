package practice;

import java.util.*;
public class LeapYear{
	public static void main(String[]args) {
		int year;
		System.out.println("enter a year/n");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					System.out.println("year is leap");
				else
					System.out.println("year is not leap");
			}
			else
				System.out.println("year is not leap");
		}else
			System.out.println("year is not leap");
	}
}
