package ArrayIntro;

import java.util.Arrays;

public class MedianFind {

	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 2, 7, 5, 8, 6};
		median(arr);

	}
	public static void median(int[] arr) {
		Arrays.sort(arr);
		
		int lo = 0;
		int hi = arr.length-1;
		
		int mid = (lo + hi)/2;
		double ans = 0;
		
			int k = arr.length;
			
			if(k % 2 != 0) {
				
				ans = (double)arr[mid];
			}
			else {
			    ans = (double)(arr[mid] + arr[mid+1])/2;
			}
		System.out.println(ans);
	}
}
