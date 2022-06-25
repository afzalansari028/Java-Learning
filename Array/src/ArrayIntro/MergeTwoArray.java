package ArrayIntro;

import java.util.Scanner;

public class MergeTwoArray
{
	 public static void main(String[] args)
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter test cases");
				int t = sc.nextInt();
			while(t-- != 0)
			{
				System.out.println("Enter both array size");
				int n = sc.nextInt();
				int m = sc.nextInt();
				int a1[] = new int[n];
				int a2[] = new int[m];
				
				 int l1 = a1.length;
				 int l2 = a2.length;
				 
				 int arr[] = new int[l1+l2];
				 System.out.println("Enter elements in first array");
				 for(int i=0;i<n;i++) {
					 a1[i] = sc.nextInt();
				 }
				 System.out.println("Enter elements in second array");
				 for(int j=0;j<m;j++) {
					 a2[j] = sc.nextInt();
				 }
				 merge(a1,l1,a2,l2,arr);
				
				for(int i=0;i<arr.length;i++)
				{
				System.out.print(" "+arr[i]);
				}
			  }
		}
		public static void merge(int a1[],int l1,int a2[],int l2,int arr[])
		{
		 int i = 0;
		 int j = 0;
		 int k = 0;
		  while(i < l1 && j < l2)
		 {
			if(a1[i] < a2[j])
			{
				arr[k] = a1[i];
				k++; i++;
			}
			else
			  {
				arr[k] = a2[j];
				k++; j++;
			  } 
		 }
	      	while(i < l1)
		     {
			   arr[k] = a1[i];
			   k++; i++;
		     }
		      while(j < l2)
	         	{
			    arr[k] = a2[j];
			    k++;j++;
	         	}   
	   }
}

