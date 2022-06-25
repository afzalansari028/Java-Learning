package Arrays;

public class MaxCircularSubArraySum {

	public static void main(String[] args) {
		
		int arr[] = {2,1,-5,4,-3,1,-3,4,1};
		int n = arr.length;
//	 System.out.println(kadane(arr,n));
	 System.out.println(maxCircularSubArraySum(arr,n));
		
	}	
		public static int kadane(int arr[], int n) {
			
			int maxSum = Integer.MIN_VALUE;
			int currSum = 0;
			for(int i=0;i<n; i++) {
				currSum = currSum + arr[i];
				if(currSum > maxSum) {
					maxSum = currSum;
				}
				if(currSum < 0) {
					currSum = 0;
				}
			}
			maxSum = Math.max(currSum, maxSum);
			return maxSum;
		}
		
		public static int maxCircularSubArraySum(int arr[], int n) {
			
			int nonwrapSum = kadane(arr, n);
			
			int totalSum = 0;
			for(int i=0;i<n;i++) {
				totalSum = totalSum + arr[i];
				arr[i] = -arr[i];		
				
			}
			int wrapSum = totalSum + kadane(arr, n);
			
			int maxSum = Math.max(nonwrapSum, wrapSum);
			
			return maxSum;	
			
		}

}
