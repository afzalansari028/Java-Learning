package FundamentalsAndPatterns;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int arr[] = new int[size];
		 
		 int result = Conversion(n);
		 System.out.println(result);
	  }
		
      public static int Conversion(int n) 
      {
		int base = 1;
		int decimalVal = 0;
		int temp = n;
		while(temp > 0) {
			int remainder = temp % 10;
			temp = temp / 10;
			decimalVal = decimalVal + remainder * base;
			base = base*2;
		}
		return decimalVal;
	}

}
