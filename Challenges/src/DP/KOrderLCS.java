package DP;

public class KOrderLCS {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {5,3,1,4,2,6};
		int k = 1;
		
	 System.out.println(kOrderedLCSRec(arr1, arr2, k, 0, 0));

	}
	public static int kOrderedLCSRec(int arr1[], int arr2[], int k, int vidx1, int vidx2) {
	
		if(arr1.length == vidx1 || arr2.length == vidx2) {
			return 0;
		}
		
        int a = 0;
        int b = 0;
	  for(int i=0;i<arr1.length-1;i++) {
		   a = arr1[i];
	  }
	  for(int j=0;j<arr2.length-1;j++) {
		   b = arr2[j];
	  }
	  
	  int ans = 0;
	  
	  if(arr1[a] == arr2[b]) {
		 ans = kOrderedLCSRec(arr1, arr2, k, vidx1 + 1, vidx2 + 1) + 1; 
	  }
	  else {
		  int o1 = kOrderedLCSRec(arr1, arr2, k, vidx1, vidx2+1);
		  int o2 = kOrderedLCSRec(arr1, arr2, k, vidx1+1, vidx2);
		  int o3 = 0;
		  
		  if(k >= 1)
		  o3 = kOrderedLCSRec(arr1, arr2, k-1, vidx1 + 1, vidx2 + 1) + 1;
		  
		  ans = Math.max(o1, Math.max(o2, o3));
	   }
	  return ans;
	}

}
