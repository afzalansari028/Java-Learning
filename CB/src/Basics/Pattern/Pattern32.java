package Basics.Pattern;

public class Pattern32 {

	public static void main(String[] args) {
		int n = 5;
		int val = 1;
		int row = 2*n-1;
		int k=0;
		for(int i=1;i<=row;i++) {
			if(i<=n)
				k++;
			else
				k--;
			for(int j=1;j<=n;j++) {
				if(j <= k)
				System.out.print(val+" * ");		
			}
			val++;
			System.out.println();
		}

	}

}
