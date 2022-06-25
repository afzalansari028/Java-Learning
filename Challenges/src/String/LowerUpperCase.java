package String;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		lowerupper(ch);
	}

	public static void lowerupper(char ch) {
		if (ch >= 65 && ch <= 90) {
			System.out.println("UPPERCASE");
		} 
		else if (ch >= 97 && ch <= 122) {
			System.out.println("lowercase");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
