package ArrayIntro;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumByTwoPointer
{
	public static boolean getNumber(int a[], int search)
	{
       int i = 0;
       int j = a.length-1;
       while(i < j)
       {
    	   int sum = a[i] + a[j];
    	   if(sum == search)
    		   return true;
    	   else if(sum < search)
    		   i++;
    	   else
    		   j--;
       }
       return false;
	}
	public static void main(String args[])
	{
		int a[] = {5,2,-1,4,3,2,2};
		Arrays.sort(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number u want to search");
		 int search = sc.nextInt();
		 System.out.println(getNumber(a,search));
	}

}
