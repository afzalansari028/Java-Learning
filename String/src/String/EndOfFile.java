package String;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       int line = 0;
	        while(sc.hasNext()) {
	            System.out.println(++line+" "+sc.nextLine());
	        }

	}

}
