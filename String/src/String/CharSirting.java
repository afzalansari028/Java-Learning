package String;
import java.util.*;
public class CharSirting 
{
	public static void main(String[] args) 
	{
	  String s1 = "abacdefgead";
	  String a[] = s1.split("");
	  for(int i=0;i<s1.length()-1;i++)
	  {
		for(int j=i+1;j<s1.length()-1;j++)
		{
			if(a[i].compareTo(a[j]) > 0)
			{
				String temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}		
		}
		System.out.print(a[i]);
	  }

	}

}
