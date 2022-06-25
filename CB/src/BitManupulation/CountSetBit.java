package BitManupulation;

import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int num = sc.nextInt();
		System.out.println(countSetBit(num));
		}
	}
	public static int countSetBit(int n) {
		
		int count = 0;
		while(n > 0) {
			
			if((n & 1) > 0){
				count++;
			}
			n = n>>1;
		}
		return count;
	}

}
