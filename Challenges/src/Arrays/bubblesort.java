package Arrays;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int a[] = new int[n];
		  for(int i=0;i<n;i++) {
			  a[i] = sc.nextInt();
		  }
		  bubbleSort(a);
		  for(int i=0;i<a.length;i++) {
			  System.out.println(a[i]);
		  }
	}
	public static void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                     
                    int temp = arr[j]; 
                      arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 

}
