package ArrayIntro;

public class TwoSum 
{
	public static void main(String[] args) 
	{
		int a[] = {1,3,4,-2,-1};
		int search = 0;
		 System.out.println(TwoSum(a,search));
	}
	public static boolean TwoSum(int a[],int search)
	{	 
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] + a[j] == search)
				  {
                    return true;
				  }
		     }
		}
		return false;
	}

}
