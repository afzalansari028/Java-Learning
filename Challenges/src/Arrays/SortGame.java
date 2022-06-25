package Arrays;

import java.util.Scanner;

public class SortGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 78;
		int n = 4;
		String name[] = new String[n];
		int sal[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter name and salary");
		name[i] = sc.next();
         sal[i] = sc.nextInt();			
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1-i;j++) {
				if(sal[j] < sal[j+1]) {
					int temp = sal[j];
					  sal[j] = sal[j+1];
					  sal[j+1] = temp;
					  
					  String t = name[j];
					  name[j] = name[j+1];
					  name[j+1] = t;
				}
			}
		}
		for(int i=0;i<n;i++) {
		System.out.println(name[i]+"  "+sal[i]);
		}
	}

}
