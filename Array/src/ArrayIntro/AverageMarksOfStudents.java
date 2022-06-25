package ArrayIntro;

import java.util.Scanner;

public class AverageMarksOfStudents 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		System.out.println("Enter the marks now");
		int Average = 0;
		int marks[] = new int[n];
		for(int i=0;i<n;i++)
		{
		  marks[i] = sc.nextInt();
		  Average = Average + marks[i];
		  
		}
		 Average = Average/n;
		System.out.println("Average of marks is : "+Average);

	}

}
