package String;

public class CompareToMethod
{
	public static void main(String[] args)
	{
		String temp = "";
		
		String S = "Badlapur,Allahabad,Jaunpur,Varanasi";
		System.out.print("Before sorting :");
		System.out.println(S);
		System.out.println("After sorting :");
	      String a[] = S.split(",");
	    for(int i=0;i<4;i++)
	    {
	    	for(int j=i+1;j<4;j++)
	    	{
	    		if(a[i].compareTo(a[j]) > 0)
	    		{
	    			temp = a[i];
	    			a[i] = a[j];
	    			a[j] = temp;
	    			
	    		}
	    	}
	       System.out.println(a[i]);
	    }
	    
	}

}
