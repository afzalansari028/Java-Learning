package Recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(6));
		
	}
	static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int ans =  n*fact(n-1);
		return ans;
		
	}

}
