package Arrays;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[][] = new int[N][M];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		System.out.println(matrixSearch(arr, x));

	}

	public static int matrixSearch(int[][] arr, int x) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == x) {
					
					return 1;
				}
			}
		}
		return 0;
	}

}
