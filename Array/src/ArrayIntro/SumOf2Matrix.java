package ArrayIntro;

import java.util.Scanner;

public class SumOf2Matrix 
{
	public static void main(String[] args) 
	{
		int i,j;
		
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter row value");
	  int row = sc.nextInt();
	  System.out.println("Enter column value");
	   int col = sc.nextInt();
	   
	      int a[][] = new int [row][col];
		  int b[][] = new int [row][col];
	      int c[][] = new int [row][col];
	 
		  System.out.println("Enter the elements in first array");
        for(i=0;i<row;i++)
	    {
	      for(j=0;j<col;j++)
          {
         a[i][j] = sc.nextInt();
  	      }
	    }
	   
        System.out.println("Enter the elements in second array");
        for(i=0;i<row;i++)
	    {
	      for(j=0;j<col;j++)
          {
         b[i][j] = sc.nextInt();
  	      }
	    }
	   
	       for(i=0;i<row;i++)
	       {
	    	  for(j=0;j<col;j++)
	    	  {
	    		c[i][j] = a[i][j] + b[i][j];  
	    	  }
	       }
	       System.out.println("Sum of two matrices are: ");
	       for(i=0;i<row;i++)
	        {
	    	  for(j=0;j<col;j++)
	    	  {
	    		  System.out.print(" "+c[i][j]);
	    	  }
	       System.out.println();
	        }
	}

}
