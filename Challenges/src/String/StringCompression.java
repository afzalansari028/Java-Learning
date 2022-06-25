package String;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		get_compressed(str);
	}
	 public static void get_compressed(String str)
	 {
		for(int i=0;i<str.length();i++) {
			int count = 1;
		  while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
		  {
			count++; 
			i++;
		  }
		 if(count == 1)
		  {
			 System.out.print(str.charAt(i));
		  }
		 else
		 {
			 System.out.print(str.charAt(i));
			 System.out.print(count);
		 }
		
	    }
	}
}
	