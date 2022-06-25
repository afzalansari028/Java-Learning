package ArrayIntro;

public class Check {
	
	public static int trap(int[] height)
	{
	    int res = 0;
	
	    for(int i = 1; i < height.length - 1; i++)
	    {
	         
	        int left = height[i];
	        for(int j = 0; j < i; j++)
	        {
	            left = Math.max(left, height[j]);
	        }
	 
	        int right = height[i];
	        for(int j = i + 1; j < height.length; j++)
	        {
	            right = Math.max(right, height[j]);
	        }
	
	        res += Math.min(left, right) - height[i];
	    }
	    return res;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int[] arr = {12,0,1,0,2,1,0,1,3,2,1,2,1};
//	    int n = arr.length;
	 
	    System.out.print(trap(arr));
	}
	}
	
 
	  


