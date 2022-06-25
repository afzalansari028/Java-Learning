package Basics.Pattern;

public class Patteren6 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
