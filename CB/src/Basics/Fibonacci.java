package Basics;

public class Fibonacci {

	public static void main(String[] args) {
		int prev = 0;
		System.out.print(prev+" ");
		int current = 1;
		System.out.print(current+" ");
		int next = 0;
		int n = 7;
		for(int i=0;i<n-2;i++) {
			next = prev + current;
			prev = current;
			current = next;
		System.out.print(next+" ");
		}
	}

}
