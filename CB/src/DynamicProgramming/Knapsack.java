package DynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {
		int wt[] = {1,2,3,2,2};
	 int price[] = {8,4,0,5,3};
	 int cap = 4;
		
//		int wt[] = new int[1000];
//		int price[] = new int[1000];
//		for(int i=0;i<price.length;i++) {
//			wt[i] = i+1;
//		 price[i] = i+1;
//		}
//		int cap = 70;
	 
//		long start = System.currentTimeMillis();
	 System.out.println(KnapsackRecursion(wt, price, 0, cap));
//	 System.out.println(KnapsackTD(wt, price, 0, cap, new int[wt.length][cap+1]));
	 System.out.println(KnapsackBU(wt, price, cap));
//	    long end = System.currentTimeMillis();
//	    System.out.println(end-start);

	}
	
	public static int KnapsackRecursion(int[] wt, int[] price, int vidx, int cap) {
		
		if(vidx == wt.length || cap == 0) {
			return 0;
		}
//		exclude
		int e = KnapsackRecursion(wt, price, vidx+1, cap);
		
//		include
		int i = 0;
		
		if(cap >= wt[vidx])
			i = KnapsackRecursion(wt, price, vidx+1, cap-wt[vidx]) + price[vidx];
		
		int ans = Math.max(i, e);
		
		return ans;
	}
	
//	  Apply Top Down DP
	 public static int KnapsackTD(int[] wt, int[] price, int vidx, int cap, int strg[][]) {
		 
	  if(vidx == wt.length || cap == 0) {
		return 0;
    	}
	  
	  if(strg[vidx][cap] != 0) {
		  return strg[vidx][cap];
	  }
//	  exclude
	  int e = KnapsackTD(wt, price, vidx+1, cap, strg);
	
//	  include
	  int i = 0;
	
	   if(cap >= wt[vidx])
		 i = KnapsackTD(wt, price, vidx+1, cap-wt[vidx], strg) + price[vidx];
	
       int ans = Math.max(e, i);
       
       strg[vidx][cap] = ans;
	
     	return ans;
     }
	 
//	 Apply Bottom Up DP
	 public static int KnapsackBU(int[] wt, int[] price, int cap) {
		 
		 int n = wt.length;
		 
		 int strg[][] = new int[n+1][cap+1];
		 
		 for(int row=n-1; row>=0; row--) {
			 
			 for(int col=1; col<=cap; col++) {
				 
				 int e = strg[row+1][col];
				 
				 int i = 0;
				 if(col >= wt[row]) 
					 i = strg[row+1][col-wt[row]] + price[row];
				 
				 int ans = Math.max(e, i);
				 
				 strg[row][col] = ans;
			 }
		 }
		 return strg[0][cap];
	 }

}
