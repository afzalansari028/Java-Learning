package Basics.Pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		int col = 2*n-1;    
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=col;j++) 
				if(j>=n-i+1 && j<=n+i-1)
				 System.out.print("*");
				else
				 System.out.print(" ");
		
			System.out.println();
		}
	}

}
