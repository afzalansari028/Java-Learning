package Arrays;

import java.util.Scanner;

public class PrimeVisits {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	
		  int a = 1;             
		  int b = 20;               
		  int i;
		  
		 
		  for(int num=a; num<=b; num++) {
			  
			  for(i=2;i<num;i++) {
				  
				  if(num % i == 0) {
					  
					  break;
				  }
			  }
			  if(i == num)
				  System.out.print(" "+num);
		  }      
   }
}