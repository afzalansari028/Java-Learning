package Basics.Pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 2*n-1;
		int k=0;
		for(int i=1;i<=row;i++) {
			if(i<=n)
				k++;
			else
				k--;
			for(int j=1;j<=n;j++) {
				if(j <= k)
				System.out.print("* ");		
			}
			System.out.println();
		}

	}

}
