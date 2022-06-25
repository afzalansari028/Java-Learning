package Arrays;

import java.util.Scanner;

public class StringSort                              //TEST CASES FAILED
{
   public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp;
//		System.out.println("Enter the number of string");
		int n = sc.nextInt();
		String str[] = new String[n];
 //   	System.out.println("enter the string value");
    	sc.nextLine();
		for(int i=0;i<n;i++)
		{
		   str[i] = sc.nextLine();
		}
		
	  for(int i=0;i<n;i++)
	  {
		  for(int j= i+1;j<n;j++) 
		  {
			  if(str[i].compareTo(str[j]) > 0 )
			  {
				  temp = str[i];
				  str[i] = str[j];
				  str[j] = temp;
				  
			  }
		  }
	  }
	  
	     for(int i=0;i<n;i++)
	     {
		  System.out.println(str[i]+" ");
	     }
	}
}
