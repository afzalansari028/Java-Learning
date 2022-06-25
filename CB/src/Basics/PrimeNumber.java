package Basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		boolean flag = true;
		while(i <= n-1) {
			if(n % i == 0) {
			   flag = false; 
		    }
			i++;
		}
		  if(flag == true) {
				System.out.println("Prime");
			}
			else {
				System.out.println("not prime");
			}
				
		}

}
