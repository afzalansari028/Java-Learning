package FundamentalsAndPatterns;

import java.util.Scanner;

public class DelhisOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		oddEven(n);
	}
		public static void oddEven(int n){

	        int oddSum = 0;
	        int evenSum = 0;

	        while(n != 0){

	            int rem = n % 10;
	            if(rem % 2 == 0){
	                evenSum = evenSum + rem;
	            }else{
	                oddSum = oddSum + rem;
	            }

	            n = n/ 10;
	        }

	        if(evenSum % 4 == 0 || oddSum % 3 == 0){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	    }
}
