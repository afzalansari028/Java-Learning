package String;

public class MySortString 
{
	
  public void sort(String s1)
  {
	 String a[] = s1.split("");
	 for(int i=0;i<=s1.length()-1;i++)
	 {
		 for(int j=i+1;j<=s1.length()-1;j++)
		 {
			 if(a[i].compareTo(a[j]) > 0)
			 {
		  String temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
			 }
		 }
	//	 System.out.print(a[i]);
	 }
  }

}
