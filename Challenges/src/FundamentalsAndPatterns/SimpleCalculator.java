package FundamentalsAndPatterns;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]) {
    	        
    			Scanner sc = new Scanner(System.in);
    			char ch;
    		
    			while (true) {
    				ch = sc.next().charAt(0);
    				int z = 0;
    				while (ch != 'x' && ch != 'X') {
    					int n1 = sc.nextInt();
    					int n2 = sc.nextInt();

    					if (ch == '+') {
    						z = n1 + n2;
    						break;
    					} else if (ch == '-') {
    						z = n1 - n2;
    						break;

    					} else if (ch == '/' && n2 != 0) {
    						z = n1 / n2;
    						break;

    					} else if (ch == '*') {
    						z = n1 * n2;
    						break;
    					} else if(ch == '%' && n2 !=0) {
    						z = n1 % n2;
    						break;
    					}else {
    						System.out.println("Invalid operation. Try again.");
    						break;
    					}
    				}
    				if (ch == 'x' || ch == 'X') {
    					break;
    				}
    				if(ch == '-' || ch=='+' || ch=='/' || ch=='*' || ch=='%') {
    				System.out.println(z);
    			   }

    		  }
    	    }
    	}
