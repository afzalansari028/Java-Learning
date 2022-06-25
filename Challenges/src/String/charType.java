package String;

import java.util.Scanner;

public class charType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(Ctype(ch));
		
	}
	public static char Ctype(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			return 'L';
		}
		else if(ch >= 'A' && ch <= 'Z') {
			return 'U';
		}
		else {
			return 'I';
		}
	}
}

