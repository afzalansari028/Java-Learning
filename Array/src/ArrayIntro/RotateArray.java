package ArrayIntro;

import java.util.Scanner;

  public class RotateArray 
   { 
	  public void rotateLeft()
	  {
		  
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter rotation number");
    	int rotationNo = sc.nextInt();
    	System.out.println("Enter array size");
    	 int n = sc.nextInt();
    	 System.out.println("Enter the "+n+" elements");
    	 int arr[] = new int[n];
    	  for(int i=0;i<n;i++)
    	  {
    		arr[i] = sc.nextInt();
    	  } 
    		  int temp;
        	while(rotationNo!=0)
        	{
              temp = arr[0];
              for(int i=0;i<n-1;i++)
                arr[i] = arr[i+1];
              arr[n-1] = temp;
                rotationNo--;
        	}
              for(int i=0;i<n;i++)
       	       {
       		 System.out.print(" "+arr[i]);
       	       }
      }
    public static void main(String args[])
     {
    	
    	  
          RotateArray obj = new RotateArray();
                      obj.rotateLeft();
     }
   }