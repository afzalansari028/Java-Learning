package DP;

import java.util.Scanner;

public class Mixtures {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);	
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	 System.out.println(MixturesBU(arr));	

	}
	
	public static int MixturesBU(int arr[]) {
   	 
   	 int n = arr.length;
   	 
   	 int strg[][] = new int[n][n];
   	 
   	 for(int slide=0; slide<=n-1; slide++) {
   		
   		 for(int si=0;si<=n-slide-1;si++) {
   			 
   			 int ei = si + slide;
   			 
   			 if(si == ei) {
   				 strg[si][ei] = 0;
   			 }
   			 else {
   				 int min = Integer.MAX_VALUE;
   				 for(int k=si; k<=ei-1; k++) {
   					 
   					 int fp = strg[si][k];
   					 int sp = strg[k+1][ei];
   					 
   					 int sw = color(arr, si, k) * color(arr, k+1, ei);
   					 int total = fp + sp + sw;
   					 
   					 if(total < min) {
   						 min = total;
   					 }
   				 }
   				strg[si][ei] = min;
   			 }
   		 }
   	 }
   	 return strg[0][n-1];
    }
	
	public static int color(int arr[], int i, int j) {
		int sum = 0;
		for(int k=i;k<=j;k++) {
			sum = sum + arr[k];
		}
		return sum % 100;
	}

}
