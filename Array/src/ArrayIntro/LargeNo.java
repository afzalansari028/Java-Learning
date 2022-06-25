package ArrayIntro;

import java.util.Scanner;

public class LargeNo 
{

	public static void main(String[] args) 
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int max = a[0];
		 System.out.println("Enter the elements in array");
		for(i=0;i<n;i++)
		{
		  a[i] = sc.nextInt();	
		}
		  for(i=1;i<n;i++)
		  {
			  if(a[i] > max)
				  max = a[i];
		     }
			 System.out.println(" "+max);
          
	}

}
