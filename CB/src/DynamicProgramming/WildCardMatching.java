package DynamicProgramming;

public class WildCardMatching {

	public static void main(String[] args) {
		String src = "baaabab";
		String pat = "a*ab";
		
	 // System.out.println(WildCardMatchingRecursion(src, pat));	
//	  System.out.println(WildCardMatchingRecursion(src, pat, 0, 0));	
	  System.out.println(WildCardMatchingTD(src, pat, 0, 0, new int[src.length()][pat.length()]));	
	  System.out.println(WildCardMatchingBU(src, pat));	

	}
	
	public static boolean WildCardMatchingRecursion(String src, String pat) {
		
		if(src.length() == 0 && pat.length() == 0) {
			return true;
		}
		if(src.length() != 0 && pat.length() == 0) {
			return false;
		}
		if(src.length() == 0 && pat.length() != 0) {
			for(int i=0;i<pat.length();i++) {
				if(pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		
		char chs = src.charAt(0);
		char chp = pat.charAt(0);
		
		String ros = src.substring(1);
		String rop = pat.substring(1);
		
		boolean ans ;
		
		if(chs == chp || chp == '?') {
			ans = WildCardMatchingRecursion(ros, rop);
		}
		
		else if(chp == '*') {
			
			boolean blank = WildCardMatchingRecursion(src, rop);
			boolean multiple = WildCardMatchingRecursion(ros, pat);
			
			ans = blank || multiple;
		}
		else {
			ans = false;
		}
		return ans;
	}
	
//	Using virtual index
    public static boolean WildCardMatchingRecursion(String src, String pat, int svidx, int pvidx) {
		
		if(src.length() == svidx && pat.length() == pvidx) {
			return true;
		}
		if(src.length() != svidx && pat.length() == pvidx) {
			return false;
		}
		if(src.length() == svidx && pat.length() != pvidx) {
			for(int i=svidx;i<pat.length();i++) {
				if(pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		
		char chs = src.charAt(svidx);
		char chp = pat.charAt(pvidx);
		
		boolean ans ;
		
		if(chp == chs || chp == '?') {
			ans = WildCardMatchingRecursion(src, pat, svidx+1, pvidx+1);
		}
		
		else if(chp == '*') {
			
			boolean blank = WildCardMatchingRecursion(src, pat, svidx, pvidx+1);
			boolean multiple = WildCardMatchingRecursion(src, pat, svidx+1, pvidx);
			
			ans = blank || multiple;
		}
		else {
			ans = false;
		}
		return ans;
	}
    
//    Apply Top Down Dp
    public static boolean WildCardMatchingTD(String src, String pat, int svidx, int pvidx, int strg[][]) {
		
		if(src.length() == svidx && pat.length() == pvidx) {
			return true;
		}
		if(src.length() != svidx && pat.length() == pvidx) {
			return false;
		}
		if(src.length() == svidx && pat.length() != pvidx) {
			for(int i=svidx;i<pat.length();i++) {
				if(pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		
		if(strg[svidx][pvidx] != 0) {
			return (strg[svidx][pvidx] == 2) ? true : false;
		}
		
		char chs = src.charAt(svidx);
		char chp = pat.charAt(pvidx);
		
		boolean ans ;
		
		if(chp == chs || chp == '?') {
			ans = WildCardMatchingTD(src, pat, svidx+1, pvidx+1, strg);
		}
		
		else if(chp == '*') {
			
			boolean blank = WildCardMatchingTD(src, pat, svidx, pvidx+1, strg);
			boolean multiple = WildCardMatchingTD(src, pat, svidx+1, pvidx, strg);
			
			ans = blank || multiple;
		}
		else {
			ans = false;
		}
		
		strg[svidx][pvidx] = (ans == true ? 2 : 1);
		return ans;
	}
    
//    Apply Bottom Up DP
    public static boolean WildCardMatchingBU(String src, String pat) {
    	
    	boolean strg[][] = new boolean[src.length()+1][pat.length()+1];
    	
    	strg[src.length()][pat.length()] = true;
    	
    	for(int row=src.length(); row>=0; row--) {
    		
    		for(int col=pat.length()-1; col>=0; col--) {
    			
    			if(row == src.length()) {
    				if(pat.charAt(col) == '*') {
    					strg[row][col] = strg[row][col+1];
    				}
    				else {
    					strg[row][col] = false;
    				}
    			continue;
    		}
    		
    		   char chs = src.charAt(row);
    		   char chp = pat.charAt(col);
    		   
    		   boolean ans;
    			
    			if(chp == chs || chp == '?') {
    				ans = strg[row+1][col+1];
    			}
    			
    			else if(chp == '*') {
    				
    				boolean blank = strg[row][col+1];
    				boolean multiple = strg[row+1][col];
    				
    				ans = blank || multiple;
    			}
    			else {
    				ans = false;
    			}
    			
    			strg[row][col] = ans;
    		}
    	}
    	return strg[0][0];
    }

}
