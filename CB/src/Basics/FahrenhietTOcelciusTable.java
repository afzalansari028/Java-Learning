package Basics;

import java.util.Scanner;

public class FahrenhietTOcelciusTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fmin = 0;
		int fmax = sc.nextInt();
		int fstep = sc.nextInt();
		int fcurrent = fmin;
		
		while(fcurrent <= fmax) {
			int celcius = (int)((5.0/9)*(fcurrent - 32));
			System.out.println(fcurrent+"\t"+celcius);
			fcurrent += fstep;
		}

	}

}
