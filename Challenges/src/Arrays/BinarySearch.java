package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			 array[i] = sc.nextInt();	
		}
		int item = sc.nextInt();
		System.out.println(binarySearch(array,item));

	}

	public static int binarySearch(int arr[], int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] < item) {
				low = mid + 1;
			}
			else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid; // mid = index value at item is present.
			}

		}
		return -1; // item does not exist.
	}

}
