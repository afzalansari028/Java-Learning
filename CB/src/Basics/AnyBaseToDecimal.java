package Basics;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		
		int snum = 1010;
		int sb = 2;
		
		int ans = anyBaseToDecimal(snum, sb);
		System.out.println(ans);

	}
	public static int anyBaseToDecimal(int snum, int sb) {
		int decimal = 0;
		int base = 1;
		while(snum != 0) {
			
     		int rem = snum % 10;
	    	decimal = decimal + rem * base;
		    snum = snum / 10;
		    base = base * sb;
		}
		return decimal;
	}

}
