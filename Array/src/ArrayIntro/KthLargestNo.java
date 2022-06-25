package ArrayIntro;

import java.util.Arrays;

public class KthLargestNo
{

	public static void main(String[] args) {
		int arr[] = {7,10,4,3,20,15};
		int k = 3;
	  System.out.println(kthMax(arr, k));
	  System.out.println(kthMin(arr,k));

	}
	
	public static int kthMax(int arr[], int k) {
		Arrays.sort(arr);
		
		return arr[arr.length - k];		
	}
	
	public static int kthMin(int[] arr, int k) {
		Arrays.parallelSort(arr);
		
		return arr[k-1];
	}

}
