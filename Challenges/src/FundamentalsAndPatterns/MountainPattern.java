package FundamentalsAndPatterns;

import java.util.Scanner;

public class MountainPattern {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);	
				
	    int n = sc.nextInt();
	    
	    for(int i=1;i<=n;i++) {
	    	
	       for(int j=1;j<=i;j++) {
	    	  
	         System.out.print(j+"   ");;
	       }
	      
	       for(int k=((n-i)*2)-1;k>0;k--) {
	    	  
	          System.out.print("    ");;
	    	}
	      
	       for(int j=i;j>=1;j--) {
	          if(j!=n)
	       System.out.print(j+"   ");;
	      }
	  	
	      System.out.println();;
	    }
	  }


}
