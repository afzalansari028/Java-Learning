package ArrayIntro;

public class ArrayRearrange
{
	public static void main(String[] args)
	{
		int i,j;
	  int a[][] = {{1,2,3,4},
			       {4,6,7,2},
			       {7,8,9,5},
			       {4,5,6,7}};
	  System.out.println("Rearranged matrix");
	  for(i=0;i<4;i++);
	  {
		  int t = a[1][1];
		  a[1][1] = a[2][2];
		  a[2][2] = t;
	   }
	  for(i=0;i<4;i++);
	  {
		  int t = a[1][2];
		  a[1][2] = a[2][1];
		  a[2][1] = t;
	   }
     for(i=0;i<4;i++)
      {
       for(j=0;j<4;j++)
          {
		System.out.print(" "+a[i][j]);
          }
		System.out.println();
	  }
	}

}
