package FundamentalsAndPatterns;

public class FibanacciPattern {

	public static void main(String[] args) {
		int n = 4;
		fiboTriangle(n);
	
	}
	
	static void fib(int f[], int N) {
		f[0] = 0;
		f[1] = 1;
				
		for(int i=2;i<=N;i++) {
			f[i] = f[i-1] + f[i-2];
		}
	}
	
	static void fiboTriangle(int n) {
		int N = n*(n+1)/2;
		int f[] = new int[N+1];
		fib(f,N);
		
		int fibNum = 0;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(f[fibNum++]+" ");
			}
			System.out.println();
		}
		
	}

}
