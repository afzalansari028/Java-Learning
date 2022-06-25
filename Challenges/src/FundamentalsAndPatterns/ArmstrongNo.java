package FundamentalsAndPatterns;
import java.util.*;
public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Armstrong(num));

	}
	
	public static boolean Armstrong(int num) {
		
		
		int x = num;
		int y = x;
		int len = 0;
		while( num != 0) {
			len++;
			num = num/10;
		}
		
		int sum = 0;
		while(x != 0) {
			int r = x % 10;
			int power = (int)Math.pow(r, len);
			sum = sum + power;
			x = x / 10;
		}
	
		if(sum == y) {
			return true;
		}
		else {
			return false;
		}
	}

}
