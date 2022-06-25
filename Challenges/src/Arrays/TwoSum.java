package Arrays;

public class TwoSum
{
   public static void main(String[] args) 
    {
	   int a[] = {1,4,2,-1,6,7,4};
	   int k = 10;
	     twoSum(a,k);
	}
  
	public static void twoSum(int a[],int k)
	{
	  for(int i=0;i<a.length;i++) {
		  
		  for(int j=i+1;i<a.length;j++) {
			  if(a[i] + a[j] == k)
				  System.out.println(i+" and "+j);
		   }
	   }
	  System.out.println("-1");
	}
	
}
