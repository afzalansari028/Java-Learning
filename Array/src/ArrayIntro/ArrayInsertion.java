package ArrayIntro;
import java.util.Scanner;
public class ArrayInsertion
{
	public static void main(String args[])
	{
	int size,i,pos;
	int arr[] = new int[50];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	size =sc.nextInt();
	System.out.println("Enter array elements");
	for(i=0;i<size;i++)
	{
	   arr[i] = sc.nextInt();
	}
	System.out.print("Enter element to be inserted");
	int insert = sc.nextInt();
	System.out.println("Enter position number");
	pos = sc.nextInt();
	  for(i=size-1;i>=pos-1;i--)
	  {
		  arr[size] = arr[pos-1];
	  }
		  arr[pos-1] = insert;
	       size++;

	    System.out.println("Element inserted successfully...!!!");
	    System.out.print("Now new array is: ");
	    for(i=0;i<size;i++)
	    {
		System.out.print(" "+arr[i]);
	    }
	   
	}

}
