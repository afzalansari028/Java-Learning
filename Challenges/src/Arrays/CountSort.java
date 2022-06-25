package Arrays;

import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		countSort(a, size, size);
	}
	
	public static void countSort(int a[],int size, int max) {
		
		//find maximum number for array a
		  max = a[0];
		for(int i=1;i<size;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		int count[] = new int[max+1];
		for(int i=0;i<max;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<size;i++) {
			count[a[i]]++;
		}
		
		for(int i=1;i<=max;i++) {
			count[i] = count[i] + count[i-1];
		}
		
		int b[] = new int[size];
		for(int i=a.length-1;i>=0;i--) {
			b[--count[a[i]]] = a[i];
		}
		
		for(int i=0;i<size;i++) {
			a[i] = b[i];
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
