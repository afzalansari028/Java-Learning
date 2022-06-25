package Recursion;

public class StringReverse {

	public static void main(String args[]) {
		
		String str = "Pagal";
	     reverse(str);
	}
	
	public static void reverse(String str) {
		
		if(str.length() == 0) {
			return;
		}
		String ros = str.substring(1);
		reverse(ros);
		System.out.print(str.charAt(0));
	}
}
