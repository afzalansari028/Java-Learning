package Recursion;

public class FibinacciNum {

	public static void main(String[] args) {
		System.out.println(fib(6));

	}
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		int fnm1 = fib(n-1);
		int fnm2 = fib(n-2);
		int fn = fnm1 + fnm2;
	    return fn;
	}

}
