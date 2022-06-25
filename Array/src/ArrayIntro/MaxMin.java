package ArrayIntro;

public class MaxMin {

	public static void main(String[] args)
	{
		int a[] = {1,2,5,-1,6,3,8};
	    int Max = a[0];
	    int Min = a[0];
	  for(int i=1; i<a.length; i++)
	  {
		  if(a[i] > Max)
		   {
			  Max = a[i];
		   }
		  if(a[i] < Min)
		   {
			  Min = a[i];
		   }
	      }
			  System.out.print("Minimum is: "+Min+"\nMaximum is: "+Max );
//		  else
//			  Max = a[i];
//		  System.out.println(Max);
	  

	}

}
