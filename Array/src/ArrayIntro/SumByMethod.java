package ArrayIntro;
import java.util.Scanner;
 class SumByMethod
{
	static int arr[] = new int[100];

	static int sum()
	  {
		int sum = 0;
		int i;
		for(i=0;i<arr.length;i++)
		
			sum = sum + arr[i];	
    
	   return sum;
	   }
	
	public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
		int t=0;
		System.out.println("Enter test cases");
		t = sc.nextInt();
		for(int r=0; r<t; r++)
		{
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
		  arr[i] = sc.nextInt();
		}
		System.out.println(" "+sum());
	 }
	 }
	
}