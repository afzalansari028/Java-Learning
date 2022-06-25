package FundamentalsAndPatterns;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("press +");
//		System.out.println("press -");
//		System.out.println("press *");
//		System.out.println("press /");
//		System.out.println("press X");
		char ch;
	  do {	
		System.out.println("Enter your choice");
		 ch = sc.next().charAt(0);
		
		System.out.println("Enter the two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = 0;
	
		switch(ch) {
		
		case '+':
			  result = n1+n2;
			  break;
		case '-':
			  result = n1-n2;
			  break;
		case '*':
			  result = n1*n2;
			  break;
		case '/':
			  result = n1/n2;
			  break;
		case 'X':
			    return;
		default :
			   System.out.println("Invalid operstion.Try again");
		}
	  System.out.println(result);
	  }
	  while(ch != 'X');
	}

}
