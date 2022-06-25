package DynamicProgramming;

import java.util.Arrays;

public class MazePathCount {

	public static void main(String[] args) {
		int n = 2;
    System.out.println(MPRecursion(0, 0, n, n));
      System.out.println(MPTD(0, 0, n, n,new int[n+1][n+1]));
      System.out.println(MPBU(n, n));
      System.out.println(MPBUSE(n, n));
	}

//	By recursion
	public static int MPRecursion(int cr, int cc, int er, int ec) {
		if(cr == ec && cc == ec ) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		
		int ch = MPRecursion(cr, cc+1, er, ec);
		int cv = MPRecursion(cr+1, cc, er, ec);
		
		return ch + cv;
	}
	
	//Apply DP Top Down approach
	public static int MPTD(int cr, int cc, int er, int ec, int[][] strg) {
		if(cr == ec && cc == ec ) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		if(strg[cr][cc] != 0) {    // re-use
			return strg[cr][cc];
		}
		int ch = MPTD(cr, cc+1, er, ec, strg);
		int cv = MPTD(cr+1, cc, er, ec, strg);
		
		strg[cr][cc] = ch + cv;  // store
		
		return ch + cv;
	}
	
//	DP botton up
	public static int MPBU(int er, int ec) {
		int[][] strg = new int[er+2][ec+2];    // size of array
		
		for(int row=er; row>=0; row--) {
			
			for(int col=ec; col>=0; col--) {    // filling direction
				
				if(row > er && col > ec) {
					strg[row][col] = 0;
				}
			  else if(row == er && col == ec) {
					strg[row][col] = 1;
				}
			  else {
				  strg[row][col] = strg[row][col+1] + strg[row+1][col];
			  }
			}
		}
		return strg[0][0];		
	}
	
//	Bottom up Space Efficient
	public static int MPBUSE(int er, int ec) {
		
		int strg[] = new int[ec+1];
		
		Arrays.fill(strg, 1);
		
		for(int slide=er-1; slide>=0; slide--) {
			
			for(int col=ec; col>=0; col--) {
				
				if(col == ec) {
					strg[col] = 1;
				}
				else {
					strg[col] = strg[col] + strg[col+1];
				}
			}
		}
		return strg[0];
	}
		
}
