package com.dev.MethodOvreloading;
import java.util.*;
public class Practice {
	static Practice p=new Practice();

	public void add(int a,int b) {
		int c=a+b;
		System.out.println("addition is= "+c);
	}

	public void add(int i,int j,int k) {
		int z=i-j-k;
		System.out.println("substraction= "+z);
	}

	public void add(int r,byte s) {
		int v=r/s;
		System.out.println("division= "+v);
	}

	public void add(int w,int x,int f,int h) {
		int n=w*x*f*h;
		System.out.println("multiplication = "+n);
	}


	public void sub(int a,int b) {
		int c=a+b;
		System.out.println("addition is= "+c);
	}

	public void sub(int i,int j,int k) {
		int z=i-j-k;
		System.out.println("substraction= "+z);
	}
	public void sub(int r,byte s) {
		int v=r/s;
		System.out.println("division= "+v);
	}

	public void sub(int w,int x,int f,int h) {
		int n=w*x*f*h;
		System.out.println("multiplication = "+n);
	}

	public void mul(int r,byte s) {
		int v=r/s;
		System.out.println("division= "+v);
	}

	public void mul(int w,int x,int f,int h) {
		int n=w*x*f*h;
		System.out.println("multiplication = "+n);
	}

	public void mul(int a,int b) {
		int c=a+b;
		System.out.println("addition is= "+c);
	}

	final void mul(int i,int j,int k) {              //final can be overload
		int z=i-j-k;
		System.out.println("substraction= "+z);
	}

	public void div(int r,byte s) {
		int v=r/s;
		System.out.println("division= "+v);
	}

	public void div(int w,int x,int f,int h) {
		int n=w*x*f*h;
		System.out.println("multiplication = "+n);
	}

	private void div(int a,int b) {                        //private can be overload
		int c=a+b;
		System.out.println("addition is= "+c);
	}

	public void div(int i,int j,int k) {
		int z=i-j-k;
		System.out.println("substraction= "+z);
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		int c=1;
		Scanner sc=new Scanner(System.in);             //object creation Scanner
		c=sc.nextInt();                               
		if(c>=1&&c<=4) {
		switch(c){
		case 1:
			p.add(3, 5);
			p.add(4, 5, 6);
			p.add(5, 6);
			p.add(4, 6, 7, 9);
			break;
		case 2:
			p.sub(6, 7);
			p.sub(8, 3, 6);
			p.sub(7, 8);
			p.sub(8, 2, 8, 9);
			break;
		case 3:
			p.mul(9, 5);
			p.mul(7, 5, 9);
			p.mul(8, 6);
			p.mul(8, 9, 9, 9);
			break;
		case 4:
			p.div(7, 5);
			p.div(7, 5, 6);
			p.div(5, 9);
			p.div(0, 6, 0, 9);
			break;
		//default :
			//System.out.println("none of the equirement");
		}
		}else {
			System.out.println("out of switch");
		}



	}

}
