package String;

import java.util.Scanner;

public class Printchars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string value");
		String str = sc.nextLine();
		
		printChars(str);

	}
	public static void printChars(String str) {
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i));
	}

}
