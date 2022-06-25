package ArrayIntro;

import java.util.Scanner;

public class SumOfSeries
{
	public static void main(String[] args)
	{
		//int arr[] = new arr[100];
		int result = 0 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		result = result + (n*(n+1))/2;
	 
	 System.out.println(" "+result);

	}

}
