package Recursion;

public class TowerOfHanoi {

	public static void main(String[] args)
	{
		int n = 3;
		toh(n,"src","dest","helper");
    }
	public static void toh(int n,String src,String dest,String helper) 
	{
		if(n == 0)
		{
		  return;
		}
		else {
			toh(n-1,src,helper,dest);
			System.out.println("Move "+n+" th disc from "+src+" to "+dest);
			toh(n-1,helper,dest,src);
		}
	}

}
