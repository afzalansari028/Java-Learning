package Basics;

public class AnyBaseToBinary {

	public static void main(String[] args) {
//      int n = 10;
//      anyBaseToBinary(n);
		int snum = 10;
		int sb = 10;
		int ans = anyBaseToDecimal(snum, sb);
		System.out.println(ans);
	}

	public static int anyBaseToDecimal(int snum, int sb) {
		int base = 1;
		int binary = 0;
		
		while(snum != 0) {
			
			int rem = snum % 2;
			binary = binary + rem * base;
			snum = snum / 2;
			base = base * 10;
		}
		return binary;
	}

//	public static void anyBaseToBinary(int n) {
//	int[] binaryNum = new int[1000];
//
//	 int i = 0;
//	  while(n > 0) {
//
//		binaryNum[i] = n % 2;
//		 n = n / 2;
//		 i++;
//	 }
//
//	 for(int j = i - 1;j>=0;j--) {
//		System.out.print(binaryNum[j]);
//	}
//  }
}
