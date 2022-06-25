package Recursion;

import java.util.Scanner;

public class FirstIndexData {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);	
		int arr[] = {6,8,1,1,8,3,45};
		System.out.println("Enter your data to search");
		int data =  sc.nextInt();
		int si = 0;
		System.out.println("Index no is: ");
   System.out.print(firstIndex(arr, si, data));
	}
	public static int firstIndex(int arr[], int si, int data) {
		
		if(si == arr.length) {
			return -1;
		}
		
		if(arr[si] == data) {
			return si;
		}
		else {
			int restAns = firstIndex(arr, si+1, data);
			return restAns;
		}

	}

}
