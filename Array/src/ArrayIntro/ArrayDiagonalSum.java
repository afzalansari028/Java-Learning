package ArrayIntro;

import java.util.Scanner;

public class ArrayDiagonalSum 
{
	public static void main(String[] args)
	{
		int Sum = 0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter array size");
	 int m = sc.nextInt();
	 int n = sc.nextInt();
	 int a[][] = new int[m][n];
	 System.out.println("Enter the elements in array");
	 for(int i=0;i<m;i++)
	 {
	  for(int j=0;j<n;j++)
	  {
		a[i][j] = sc.nextInt();  
	  }
	 }
	 System.out.println("Original matrix");
	  for(int i=0;i<m;i++)
	  {
	   for(int j=0;j<n;j++)
	   {
		 System.out.print(a[i][j]+" ");  
	   }
	   System.out.println();
	  }
	  System.out.println("Rearranged matrix");
	  for(int i=0;i<m;i++);
	  {
		  int t = a[1][1];
		  a[1][1] = a[2][2];
		  a[2][2] = t;
	   }
	  for(int i=0;i<m;i++);
	  {
		  int t = a[1][2];
		  a[1][2] = a[2][1];
		  a[2][1] = t;
	   }
	  for(int i=0;i<m;i++)
	  {
	   for(int j=0;j<n;j++)
	   {
		 System.out.print(a[i][j]+" ");  
	   }
	   System.out.println();
	  }
	  System.out.println("Diagonal matrix");
	  for(int i=0;i<m;i++)
	  {
	   for(int j=0;j<n;j++)
	    {
		  if((i==j) || (i+j)==(m-1))
			  System.out.print(" "+a[i][j]);
	    }
		  System.out.println();
	  }
	     for(int i=0;i<m;i++)
	     {
	      for(int j=0;j<n;j++)
	      {
		    if((i==j) || (i+j)==(m-1))
		    	Sum = Sum + a[i][j];
	      }
	     }
	     System.out.print("Diagonal Sum is : "+Sum);
	}
	
 }


