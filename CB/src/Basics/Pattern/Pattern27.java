package Basics.Pattern;

public class Pattern27 {

	public static void main(String[] args) {
		int n = 5;
		int Number = 1;
		int row = n;
		int col = 2*n-1;
		for(int i=1;i<=row;i++) {
			Number = 1;
			for(int j=1;j<=col;j++) {
				if(j>=n-i+1 && j<=n+i-1) {
				 System.out.print(Number+" ");         //nahi baan hai.....
					if(j <= n)
						Number++;
					else
						Number--;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
