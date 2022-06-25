package Arrays;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
 		for(int i=0;i<row;i++) {
 			for(int j=0;j<col;j++) {
 				arr[i][j] = sc.nextInt();
 			}
 		}
	  printRowWise(arr);

	}
	public static void printRowWise(int arr[][])
	{
	  for(int i=0;i<arr.length;i++)
	  {
		  if(i % 2 == 0) {
			  for(int j=0;j<arr[i].length;j++) {
				  System.out.print(arr[i][j]+", ");
			  }
		  }
		  else {
			  for(int j=arr[i].length-1;j>=0;j--) {
				  System.out.print(arr[i][j]+", ");
			  }
		  }
	  }
	  System.out.print("END");
	}

}
