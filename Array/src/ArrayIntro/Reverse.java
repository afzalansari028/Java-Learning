package ArrayIntro;

import java.util.Scanner;

public class Reverse
{

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int s = 0;
		int e = n-1;
		   	while(s < e)
			  {
				int temp = arr[s];
				    arr[s] = arr[e];
				    arr[e] = temp;
				    s++;
				    e--;
			  }
	    	for(int i=0;i<n;i++)
			{
		   System.out.print(" "+arr[i]);
	        }
	}

}
			 
			 
			 
			 
			 
			 
			 
			 
			 
	