package BitManupulation;

import java.util.Scanner;

public class UniqueNumber_l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int xr = arr[0];
		for (int i = 1; i < arr.length; i++) {

			xr = xr ^ arr[i];
		}
		System.out.println(xr);
	}
}
