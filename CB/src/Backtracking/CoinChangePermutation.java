package Backtracking;

public class CoinChangePermutation {
     static int count = 0;
	public static void main(String[] args) {
		coinChangeP(new int[] {2,3,5,6},10,"");
	}
	
	public static void coinChangeP(int[] denom, int amount, String ans) {
		
		if(amount == 0) {
			count++;
			System.out.println(count + ". " +ans);
		}
		
		if(amount < 0) {
			return;
		}
		
		for(int i=0; i<denom.length; i++) {
			coinChangeP(denom,amount - denom[i],ans + denom[i]);
		}
		
	}

}
