package Basics.Pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<6-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
		   while(j <= n-i+1) {   
			System.out.print("*");
			j++;
		} 
		   System.out.println();
		i++;
	}
	}
}
