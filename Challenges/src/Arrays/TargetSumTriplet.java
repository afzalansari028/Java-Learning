package Arrays;

import java.util.Arrays;

public class TargetSumTriplet {

	public static void main(String[] args) {
		
		int arr[] = {5,7,9,1,2,4,6,8,3};
		int target = 10;
		
//		tripletSum(arr, target);
		TripletSum(arr, target);

	}

	public static void tripletSum(int arr[], int target) {   // O(n^3)
	
		Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++)
		    {
		        for(int j=i+1;j<arr.length;j++)
		        {
		            for(int k=j+1;k<arr.length;k++)
		            {
		                if( arr[i] + arr[j] + arr[k] == target)
		                {
		                   System.out.println(arr[i] +", "+arr[j] +" and "+arr[k]);
		
		               }
	                }

                }
            }
	}
	
	public static void TripletSum(int arr[], int target) {   // O(n^2)
		
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0;i<n;i++) {
			
			int left = i + 1;
			int right = arr.length-1;
		 
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if(sum == target) {
					System.out.println(arr[i] +", "+arr[left]+" and "+arr[right]);
				     left++;
				     right--;
				}
				else if(sum < target) {
					left++;
				}
				else {
					right--;
				}
			}
		}
	}
}
	
	
	
	
	
	
	
	