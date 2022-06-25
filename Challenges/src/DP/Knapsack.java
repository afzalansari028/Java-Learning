package DP;

import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cap = sc.nextInt();
		   int wt[] = new int[N];
		int price[] = new int[N];
		
		for(int i=0; i<price.length;i++) {
			wt[i] = sc.nextInt();
		}
		for(int i=0;i<wt.length;i++) {
			price[i] = sc.nextInt();
		}
//		System.out.println(KnapsackRecursion(wt, price, 0, cap));
		System.out.println(KnapsackTD(wt, price, 0, cap,new int[wt.length][price.length]));

		
	}
	
	public static int KnapsackRecursion(int[] wt, int[] price, int vidx, int cap) {
		
		if(vidx == wt.length || cap == 0) {
			return 0;
		}
		
//		Exclude
		int e = KnapsackRecursion(wt, price, vidx+1, cap);
		
//		Include
		int i = 0;
		 if(cap >= wt[vidx])
		 i = KnapsackRecursion(wt, price, vidx+1, cap-wt[vidx]) + price[vidx];
		
		int ans = Math.max(i, e);
		
		return ans;
	}
	
//	by Top Down Dp
    public static int KnapsackTD(int[] wt, int[] price, int vidx, int cap, int[][] strg) {
		
		if(vidx == wt.length || cap == 0) {
			return 0;
		}
		
		if(strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}
		
//		Exclude
		int e = KnapsackTD(wt, price, vidx+1, cap, strg);
		
//		Include
		int i = 0;
		 if(cap >= wt[vidx])
		 i = KnapsackTD(wt, price, vidx+1, cap-wt[vidx], strg) + price[vidx];
		
		int ans = Math.max(i, e);
		
		strg[vidx][cap] = ans;
		
		return ans;
	}
	

}
