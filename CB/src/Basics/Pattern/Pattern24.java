package Basics.Pattern;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int number = 1;
		int row = n;
		int col = 2*n-1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j>=n-i+1 && j<=n+i-1)
					System.out.print(number +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
			number++;
		}
		
	}

}
