package ArrayIntro;

public class NoOfFrequency 
{
	public static void main(String[] args)
	{
	   int a[] = {1,3,4,1,2,4,3,5};
	   int search = 1;
	   System.out.println(getNumber(a,search));
	  
	}
	public static int getNumber(int a[], int search)
	{
		int count = 0;
		for(int i=0; i<a.length; i++)
			if(search == a[i])
		
			count++;
			
			return count;
	}

}
