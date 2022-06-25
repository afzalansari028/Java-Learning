package Arrays;

public class BookAllocatioProblem {

	public static void main(String[] args) {
       int arr[] = {10,20,30,40};
       int k = 2;   //no. of Students
       System.out.println(min(arr, arr.length, k));

	}
	
	public static int min(int arr[], int size, int k) {
		
		int lo = 0;
		int hi = 0;
		int total_pages = 0;
		
		for(int i=0; i<size; i++) {
			total_pages = total_pages + arr[i];
		}
		hi = total_pages;
		int ans = 0;
		
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			boolean isValid = isValid(arr, k, mid);
			  if(isValid) {
				  ans = mid;
				  hi = mid - 1;
			  }
			  else {
				  lo = mid + 1;
			  }
		}
		return ans;
	}

	private static boolean isValid(int[] arr, int k, int mid) {
		int sum = 0;
		int noOfstudents = 1;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			
			if(sum > mid) {
				noOfstudents++;
				sum = arr[i];
				
				if(noOfstudents > k) {
					return false;
				}
			}
		}
		return true;
	}
}
