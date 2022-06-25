package Arrays;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
//			System.out.println(MSSN3(arr));
//			System.out.println(MSSN2(arr));
			System.out.println(MaxSubArraySumByKadens(arr));
		}
	}

	public static int MSSN3(int arr[]) {
		
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			
			for(int j=i; j<n;j++) {
                int currSum = 0;
				for(int k=i;k<=j;k++) {
					
					currSum = currSum + arr[k];
				}
				if(currSum > maxSum)
					maxSum = currSum;
			}
		}
		return maxSum;
	}

	public static int MSSN2(int arr[]) {

		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;

		int sum[] = new int[n];
		sum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				int currSum = 0;

				currSum = sum[j] - sum[i] + arr[i];

				if (currSum > maxSum)
					maxSum = currSum;
			}
		}
		return maxSum;
	}

	public static int MaxSubArraySumByKadens(int[] arr) {
		
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			
			currSum = currSum + arr[i];
		
		  if(currSum > maxSum) {
			  maxSum = currSum;
		  }
		  
		  if(currSum < 0) {
			  currSum = 0;
		  }  
		}
		return maxSum;
	}

}
