package Recursion;

public class DecreasingNum {

	public static void main(String[] args) {
		fun(5);

	}
	static void fun(int n) {
		if(n == 0) {
			return;
		}
		else {
		System.out.println(n);
		fun(n-1);
		}
		return;
	}

}
