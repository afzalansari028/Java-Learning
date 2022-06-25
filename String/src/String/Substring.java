package String;

import java.util.Scanner;

public class Substring 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter test cases");
		  int t = sc.nextInt();
		  for(int i=0;i<t;i++)
		   {
	      System.out.println("Enter your string");
	      sc.nextLine();
		  String s = sc.nextLine();
		  System.out.println("Enter strating index");
		  int L = sc.nextInt();
		  System.out.println("Enter ending index");
		  int R = sc.nextInt();
		  System.out.println(s.substring(L,R+1));
		   }
		
	}

}
