package Recursion;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
      System.out.println(isSorted(arr,0));
	}
	
	public static boolean isSorted(int[] arr, int si) {
		if(si == arr.length-1) {
			return true;
		}
		
		if(arr[si] > arr[si+1]) {
			return false;
		}
		else {
		boolean ans = isSorted(arr,si+1);
   		return ans;
			}
		}
}
