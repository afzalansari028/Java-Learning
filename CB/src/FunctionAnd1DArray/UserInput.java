package FunctionAnd1DArray;

import java.util.Scanner;

public class UserInput {
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int array[] = takeInput();
		display(array);

	}
	public static int[] takeInput() {
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the value for "+i+" index");
			arr[i] = sc.nextInt(); 
		}
		return arr;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); 
	 }
	}

}
