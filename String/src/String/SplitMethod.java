package String;

public class SplitMethod
{
	public static void main(String[] args) 
	{
	  String S = "Afzal Ansari is not a good boy";
	  
	  String a[] = S.split(" ");
	  
	//  int len = S.length()-1;
	   for(int i=a.length-1;i>=0;i--)
	  System.out.print(" "+a[i]);

	}

}
