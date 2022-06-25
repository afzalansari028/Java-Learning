package Recursion;

import java.util.Scanner;

public class LastIndexData {

	public static void main(String[] args) {
		
		int arr[] = {6,8,1,1,8,3,45};
		int si = 0;
		int data = 8;
   System.out.println(lastIndex(arr, si, data));

	}
	
	public static int lastIndex(int arr[], int si, int data) {
		if(si == arr.length) {
			return -1;
		}
		
		int index = lastIndex(arr, si+1, data);
		
		if(index == -1) {
			
			if(arr[si] == data) {
				return si;
			}
			else {
				return -1;
			}
		}
		else {
			return index;
		}
			
	}

}
