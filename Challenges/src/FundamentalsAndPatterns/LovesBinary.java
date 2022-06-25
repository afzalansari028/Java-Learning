package FundamentalsAndPatterns;

import java.util.Scanner;

public class LovesBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int n = 0;
		while(size-- != 0)
		{		
		for (int i = 0; i < size; i++) {
			n = sc.nextInt();
			int base = 1;
			int decimal = 0;
			int temp = n;
			while (temp > 0) {
				int rem = temp % 10;
				temp = temp / 10;
				decimal = decimal + rem * base;
				base = base * 2;
			}
			System.out.println(decimal);
		}
		}
	}

}
