package DP;

public class LCS {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "acd";
		int strg[][] = new int[s1.length()][s2.length()];
		
		System.out.println(LCSRecursion(s1, s2));
		LCSTD(s1, s2, 0, 0, strg);

	}
	
	public static int LCSRecursion(String s1, String s2) {
		
		if(s1.length() == 0 || s2.length() == 0) {
          return 0;			
		}
		
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		
		 String ros1 = s1.substring(1);
		 String ros2 = s2.substring(1);
		 
		 int ans = 0;
		 
		 if(ch1 == ch2) {
			ans =  LCSRecursion(ros1, ros2) + 1;
		 }
		 else {
			 int o1 = LCSRecursion(ros1, ros2+1);
			 int o2 = LCSRecursion(ros1+1, ros2);
			 
			 ans = Math.max(o1, o2);
		 }
		 return ans;
	}
	
//	Apply DP Top Down
   public static void LCSTD(String s1, String s2, int vidx1, int vidx2, int[][] strg) {
		
		if(s1.length() == vidx1 || s2.length() == vidx2) {
			return ;
		}
		
		if(strg[vidx1][vidx2] != -1) {        
			return ;
		}
		
		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);
		
		int ans = 0;
		
		if(ch1 == ch2) {
		    return 1 + LCSTD(s1, s2, vidx1 + 1, vidx2 + 1,strg);
		}
		else {
			Math.max(LCSTD(s1, s2, vidx1, vidx2 + 1,strg),LCSTD(s1, s2, vidx1 + 1, vidx2,strg));
			
			
		}
		
		strg[vidx1][vidx2] = ans;    
		
		
		System.out.println();
		
	}

}
