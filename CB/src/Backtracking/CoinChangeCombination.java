package Backtracking;

public class CoinChangeCombination {

	public static void main(String[] args) {
		
		coinChangeCombination(new int[] {2,3,5,6},10,"",0);
	}
   
	public static void coinChangeCombination(int denom[], int amount, String ans, int lastDenomIndx)
	{
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=lastDenomIndx; i<denom.length; i++) {
			if(amount >= denom[i]) {
				coinChangeCombination(denom,amount - denom[i], ans + denom[i], i);
			}
		}
	}
}
