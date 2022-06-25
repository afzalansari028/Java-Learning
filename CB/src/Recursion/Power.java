package Recursion;

public class Power {

	public static void main(String[] args) 
	{
		int ans = power(3,4);
	  System.out.println(ans);	
	}
   public static int power(int a, int n)
   {
	   if(n == 0) {
		   return 1;  
	   }
	   int pnm1 = power(a,n-1);
	   int pn = a * pnm1; 
	   return pn;
	   
   }
		

}
