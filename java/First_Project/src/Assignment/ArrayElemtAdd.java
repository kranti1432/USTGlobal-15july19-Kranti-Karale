package Assignment;

public class ArrayElemtAdd {

	public static void main(String[] args) {
int [] arr=new int[7];
arr[0]=3;
arr[1]=6;
arr[2]=7;
arr[3]=8;
arr[4]=9;
arr[5]=3;
arr[6]=7;

int a=arr[0];
int b=(arr.length-2);
int c=(arr.length/2);
int result=a+arr[b]+arr[c];
System.out.println("addition of 1st,2nd last and middel element of array is : "+result);
}

}
