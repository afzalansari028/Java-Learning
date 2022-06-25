package ArrayIntro;

public class ArraySquare 
{
	public static void main(String[] args) 
	{
		//int m=0;
		//int k=0;
	int arr[] = {7,9,5,3,2,8};
	 int n = arr.length;
	  	  
	  for(int i=0;i<n-1;i++)
	  {
    	for(int j=0;j<n-1-i;j++)
    	{
    		if(arr[j] > arr[j+1])
    		{
    		int temp = arr[j];
    	   arr[j] = arr[j+1];
    		  arr[j+1] = temp;
    		}
    	}
	  }
    	for(int i=0;i<n;i++)
    	{
    	System.out.print(" "+arr[i]);
    	}
    	System.out.println();
    	for(int i=0;i<n;i++)
    	{
    	int m=arr[i];
    	int k = m*m;
    	System.out.print(" "+k);
    	}
    	
     }
}


