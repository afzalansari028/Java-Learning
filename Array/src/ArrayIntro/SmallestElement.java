package ArrayIntro;
import java.util.Scanner;
public class SmallestElement 
{
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int n = sc.nextInt();
	 System.out.println("Enter the elements in array");
	 int a[] = new int[n];
	 for(int i=0;i<n;i++)
	 {
	   a[i] = sc.nextInt();	 
	 }

 	 int min = a[0];
	  for(int i=1; i<4; i++)
	  {
		  if(a[i] < min)
			  min = a[i];	 
	  }
		  System.out.println(min);

	}

}
