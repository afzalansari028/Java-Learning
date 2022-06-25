package String;
import java.util.Scanner;
public class toLowercase 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases");
		    int t = sc.nextInt();
		    for(int i=0;i<t;i++)
		    {
		 System.out.println("Enter your string"); 
		  String S = sc.nextLine();
		    String s = S.toLowerCase();
		   System.out.println(s);
		 
		    } 
	 }

}

