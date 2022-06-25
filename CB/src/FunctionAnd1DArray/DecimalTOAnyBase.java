package FunctionAnd1DArray;

public class DecimalTOAnyBase {

	public static void main(String[] args) {
		int snum = 1423;
		int db = 5;
//		int ans = anybaseToDecimal(snum,sb);
//		System.out.println(ans);
		int ans = DecimalToanybase(snum,db);
		System.out.println(ans);
	}
//	public static int anybaseToDecimal(int snum,int sb) {
//		int decimal = 0;
//		int base = 1;
//		while(snum != 0) {
//			int remainder = snum % 10;
//			decimal = decimal + remainder * base;
//			snum = snum/10;
//			base = base * sb;
//		}
//	return decimal;
//	}
	
	public static int DecimalToanybase(int snum,int db) {
		int result = 0;
		int base = 1;
		while(snum != 0) {
			int remainder = snum % db;
			result = result + remainder * base;
			snum = snum/db;
			base = base * db;
		}
	return result;
	}

}
