package ArrayIntro;

import java.util.Scanner;

public class Wipro1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int N = 4;
		 int arr[] = {43,345,20,987};
		 
		 result(arr);
		 
	 }
	 
	 public static void result(int arr[]) {
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 int temp = arr[i];
			 int sum = 0;
			 while(temp != 0) {
			
				 int lastDigit = temp % 10;
				 sum = sum + lastDigit;
				 temp = temp/10;
			 }
			 System.out.print(sum+" ");
		 }
	 }
 }