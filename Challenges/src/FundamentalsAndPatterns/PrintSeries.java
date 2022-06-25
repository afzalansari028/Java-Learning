package FundamentalsAndPatterns;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int i =1;
		int count = 0;
		while(count < n1) {
			int series = 3*i+2;
		     i++;
			if(series % n2 != 0)
			{
				System.out.println(series);
				count++;
			}
		}

	}

}
