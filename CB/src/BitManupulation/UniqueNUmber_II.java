package BitManupulation;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNUmber_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		uniqueNum2(arr, n);

	}

	public static void uniqueNum2(int arr[], int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum ^ arr[i];
		}

		sum = (sum & -sum);

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < n; i++) {
			if ((arr[i] & sum) > 0) {
				sum1 = sum1 ^ arr[i];
			} else {
				sum2 = sum2 ^ arr[i];
			}
		}

		System.out.println(sum2 + " " + sum1);
	}

}
