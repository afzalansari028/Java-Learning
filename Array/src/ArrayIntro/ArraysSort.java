package ArrayIntro;

import java.util.Arrays;

public class ArraysSort
{
	public static void main(String[] args)
	{
	int a[][] = {{5,4,3},
			     {6,8,1},
			     {7,8,5}};
	   for(int i=0;i<a.length;i++) {
		   Arrays.sort(a[i]);
	   }
	   
	    for(int i=0;i<a.length;i++){	
	      for(int j=0;j<a.length;j++){
	   System.out.print(" "+a[i][j]);
	      }
	      System.out.println();
	     }
	}
}
