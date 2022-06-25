package FundamentalsAndPatterns;
import java.util.Scanner;
public class CountDIgits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		int n = sc.nextInt();
		while(num != 0) {
		 int lastDigit = num % 10;
		   if(lastDigit == n)
			   count++;
		   num = num / 10;	
		}
		System.out.println(count);

	}

}
