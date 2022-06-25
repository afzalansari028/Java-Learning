package String;

import java.util.Scanner;

public class readString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0;i<str.length()-1;i++) {
		   if(i != 0 && Character.isUpperCase(str.charAt(i)))
			System.out.println();
		
		System.out.print(str.charAt(i));
		}
	}

}
