package FundamentalsAndPatterns;

import java.util.Scanner;

public class ManmohanPatternll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 2;

		for(int i=1;i<=2;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
		for(int i=3;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j>1 && j<=i-1)
				System.out.print("0");
				else
					System.out.print(number+"");
			}
			number+=1;
			System.out.println();		
			}
	}

}
