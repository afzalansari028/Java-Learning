package Arrays;

import java.util.Scanner;

public class InsersionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		insersionSort(arr);
	}
	
	public static void insersionSort(int arr[]) {
		int temp;
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
			int j = i-1;
		   while(j >= 0 && arr[j] > temp) {
			   arr[j+1] = arr[j];
			   j--;
		   }
		   arr[j+1] = temp;	
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	

}
