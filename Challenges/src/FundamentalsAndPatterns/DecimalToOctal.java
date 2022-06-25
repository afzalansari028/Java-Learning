package FundamentalsAndPatterns;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int octal = 0;
		int base = 1;
		int n = sc.nextInt();
		while (n != 0) {
			int rem = n % 8;
			octal = octal + rem * base;
			n = n / 8;
			base = base * 10;
		}
		System.out.println(octal);

	}

}
