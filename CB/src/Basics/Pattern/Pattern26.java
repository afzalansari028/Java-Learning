package Basics.Pattern;

public class Pattern26 {

	public static void main(String[] args) {
		int n = 5;
		int Number = 1;
		int row = n;
		int col = 2*n-1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j>=n-i+1 && j<=n+i-1) {
					System.out.print(Number +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
