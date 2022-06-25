package ArrayIntro;
import java.util.Scanner;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases");
		int t = sc.nextInt();
		for(int c=0;c<t;c++)
		{
          int sum = 0;
          System.out.print("enter arraySize");
            int size = sc.nextInt();
            int a[] = new int[size];
	   
	    System.out.println("Enter array elements");
	    for(int i=0;i<size;i++)
	     {
	      a[i] = sc.nextInt();	
	     }
		   for(int i=0;i<size;i++)
		    {
	        sum = sum + a[i]; 
		    }
		     System.out.println(" "+sum);
		 }  
			
	}
}
