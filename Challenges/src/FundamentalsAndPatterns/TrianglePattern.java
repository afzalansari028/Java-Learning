package FundamentalsAndPatterns;

public class TrianglePattern {

	public static void main(String[] args) {
		int n = 5;
		int spaces
		for(int i=1;i<=n;i++) {
			
			int k = 0; 
			for(int j=1;j<=i;j++) {
				if(j<=i) {
					k = k+1;
				}
				else {
					k = k-1;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
