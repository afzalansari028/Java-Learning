package ArrayIntro;

import java.util.Scanner;

public class Deletion {
	public static void main(String[] args) {
		int size;
		int arr[] = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		size = sc.nextInt();
		System.out.println("Enter elemrnts in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter position number from u want to delete data");
		int pos = sc.nextInt();
		int item = pos;
		
		System.out.println("Elements before delete :");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		
		for (int i = pos - 1; i < size; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println();
//		size--;
		System.out.println("Elements after delete :");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.print("Deleded data is :" + item);
	}

}
