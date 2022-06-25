import java.util.Scanner;

public class TakeCharBuser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 97 && ch <= 122) // if(ch >= 'a' && ch <= 'z') 
			System.out.println("Lower Case");
		else if(ch >= 65 && ch <= 90) // if(ch >= 'A' && ch <= 'Z')
			System.out.println("Upper Case");
		else
			System.out.println("Invalid character");
	//	System.out.println(ch);
	}

}
