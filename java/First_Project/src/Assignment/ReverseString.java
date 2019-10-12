package Assignment;

public class ReverseString {

	public static void main(String[] args) {
		String str="KRANTI";
	char [] ch=str.toCharArray();
	int k=ch.length-1;
	for(int j=k;j>=0;j--) {
		System.out.print(ch[j]);
	}
		
	}

}
