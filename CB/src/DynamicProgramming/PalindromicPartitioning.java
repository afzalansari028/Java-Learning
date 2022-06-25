package DynamicProgramming;

import java.util.Arrays;

public class PalindromicPartitioning {

	public static void main(String[] args) {
	
		String s = "abacdce";
//		System.out.println(PalindromicPartitioningRec(s, 0, s.length()-1));
		
		int strg[][] = new int[s.length()][s.length()];
		for(int i=0;i<strg.length;i++) {
			Arrays.fill(strg[i], -1);
		}
	 System.out.println(PalindromicPartitioningTD(s, 0, s.length()-1, strg));	
	 System.out.println(PalindromePartitioningBU(s));	

	}

	public static int PalindromicPartitioningRec(String s, int si,int ei) {
	
		if(isPalindrome(s, si, ei)) {
			return 0;
	   }
	
	 int min = Integer.MAX_VALUE;
	 
	 for(int k=si; k<=ei-1; k++) {
		 
		 int fp = PalindromicPartitioningRec(s, si, k);
		 int sp = PalindromicPartitioningRec(s, k+1, ei);
		 
		 int total = fp + sp + 1;
		 
		 if(total < min) {
			 min = total;
		 }
	 }
	 return min;
   }

	private static boolean isPalindrome(String s, int si, int ei) {
	
		int l = si;
		int r = ei;
		
		while(l < r) {
			
			if(s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
//	Apply Top Down DP
	public static int PalindromicPartitioningTD(String s, int si,int ei, int strg[][]) {
		
		if(isPalindrome(s, si, ei)) {
			return 0;
	    }
		
		if(strg[si][ei] != -1) {
			return strg[si][ei];
		}
	
	 int min = Integer.MAX_VALUE;
	 
	 for(int k=si; k<=ei-1; k++) {
		 
		 int fp = PalindromicPartitioningTD(s, si, k, strg);
		 int sp = PalindromicPartitioningTD(s, k+1, ei, strg);
		 
		 int total = fp + sp + 1;
		 
		 if(total < min) {
			 min = total;
		 }
	 }
	 strg[si][ei] = min;
	 return min;
   }
	
//	Apply Bottom Up DP
	public static int PalindromePartitioningBU(String s) {
		
		boolean[][] isStringPalindrome = palindromeInfo(s);
		
		int strg[][] = new int[s.length()][s.length()];
		int n = s.length();
		
		for(int slide=0; slide<=n-1; slide++) {
			
			for(int si=0; si<=n-slide-1; si++) {
				
			  int ei = si + slide;
			
				if(isStringPalindrome[si][ei]) {
					strg[si][ei] = 0;
				}
			  else {
			
			    int min = Integer.MAX_VALUE;
			 
			    for(int k=si; k<=ei-1; k++) {
				 
				  int fp = strg[si][k];
				  int sp = strg[k+1][ei];
				 
				  int total = fp + sp + 1;
				 
				  if(total < min) 
					 min = total;
			   }
			    
			  strg[si][ei] = min;
			}
		   }	
		}
	return strg[0][n-1];
  }
	
	public static boolean[][] palindromeInfo(String s){
		
		boolean[][] isStringPalindrome = new boolean[s.length()][s.length()];
		
		for(int i=0; i<isStringPalindrome.length; i++) {
			Arrays.fill(isStringPalindrome[i], true);
		}
		
		for(int row=s.length()-2; row>=0; row--) {
			
			for(int col=row+1; col<s.length(); col++) {
				
				if(s.charAt(row) == s.charAt(col)) {
					isStringPalindrome[row][col] = isStringPalindrome[row+1][col-1];
				}
				else {
					isStringPalindrome[row][col] = false;
				}
			}
		}
		return isStringPalindrome;
	}
}
