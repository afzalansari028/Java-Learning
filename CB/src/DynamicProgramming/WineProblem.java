package DynamicProgramming;

public class WineProblem {

	public static void main(String[] args) {
//		int[] arr = {2,3,5,1,4};
		int arr[] = new int[1000];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
//		System.out.println(WPRecursion(arr, 0, arr.length-1, 1));
		
		System.out.println(WPTD(arr, 0, arr.length-1, 1, new int[arr.length][arr.length]));

	}
	
	public static int WPRecursion(int arr[], int si, int ei, int yr) {
		if(si == ei) {
			return arr[si] * yr;
		}
		
		int start = WPRecursion(arr, si+1, ei, yr+1) + arr[si] * yr;
	    int end = WPRecursion(arr, si, ei-1, yr+1) + arr[ei] * yr;
	    
	    int ans = Math.max(start, end);
	    
	    return ans;
	}
	
//	Apply top down DP 
	public static int WPTD(int arr[], int si, int ei, int yr, int[][] strg) {
		if(si == ei) {
			return arr[si] * yr;
		}
		
		if(strg[si][ei] != 0) {        //re-use
			return strg[si][ei];
		}
		
		int start = WPTD(arr, si+1, ei, yr+1, strg) + arr[si] * yr;
	    int end = WPTD(arr, si, ei-1, yr+1, strg) + arr[ei] * yr;
	    
	    int ans = Math.max(start, end);
	    
	    strg[si][ei] = ans;    //store
	    
	    return ans;
	  }
}
