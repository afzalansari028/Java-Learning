package twoDArrayAndArrayList;

import java.util.Scanner;

public class takeInput {

	public static void main(String[] args) {
		int[][] arr = takeInput();
		display(arr);
	}
	   private static int[][] takeInput()
	   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row value");
		int row = sc.nextInt();
		System.out.println("Enter column value");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the values for row"+row);
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	   }
		private static void display(int[][] arr)
		{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}
		

}
