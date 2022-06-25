package Recursion;

public class Pattern {

	public static void main(String[] args) {
		pattern(5,5,5);
	}
	public static void pattern(int N,int row,int col) {
		if(N == 1 ) {
			return;
		}
	      if(row <= col) {
			System.out.print("*");
			  pattern(N+1,row+1,col+1);
			  System.out.println();
		}
	}

}
