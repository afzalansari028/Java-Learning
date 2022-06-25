package String;

import java.util.Scanner;

public class Check 
{
  public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter test cases");
       int t = 0;
       while(t>0)
       {
    	   t = sc.nextInt();
	     sc.nextLine();
	     String S = sc.nextLine();
	     System.out.print(S.toLowerCase());
	     }
	}

}