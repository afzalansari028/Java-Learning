package Recursion;

public class PowerFast {
    
	public static void main(String[] args) {
		System.out.println(fastPower(2,5));	

	}
	public static int fastPower(int a,int n) {
		if(n == 0) {
			return 1;
		}
		if(n % 2 == 0) {
			return fastPower(a*a,n/2);
			
		}
		else {
			return a * fastPower(a,n-1); 
		}
	}

}
