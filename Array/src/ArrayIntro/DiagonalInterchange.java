package ArrayIntro;

public class DiagonalInterchange
{
	public static void main(String[] args)
	{
	int a[][] = {{1,2,3},
	             {4,5,6},
	             {7,8,9}};
	System.out.println("Original matrix");
	 for(int i=0;i<3;i++)
     {
   	  for(int j=0;j<3;j++)
   	  {
   		System.out.print(" "+a[i][j]);
   	  }
   	  System.out.println();
     }
	 for(int i=0;i<3;i++)
	 {
		 int temp = a[i][i];
		 a[i][i] = a[i][3-1-i];
		 a[i][3-1-i] = temp;
	 }
	  System.out.println("After arranging");
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		System.out.print(" "+a[i][j]);
    	  }
    	  System.out.println();
      }
	}

}
