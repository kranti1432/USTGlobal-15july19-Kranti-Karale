package com.array;

public class Array2 {

	public static void main(String[] args) {
	int [] arr= {1,2,3,4,5};
	int index=1;
	if(index<=arr.length) {
		System.out.println("array index is present");
		for(int i=0;i<=index;i++) {
		System.out.println(arr[i]);
	}
	}
	else {
		System.out.println("array index is not present");
	}
int middle=(arr.length-1)/2;
	System.out.println("middle element is="+arr[middle]);
	
	
	int secondlast=(arr.length-2);
	System.out.println("secondlast element of array="+arr[secondlast]);

	}

}
