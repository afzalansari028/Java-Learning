package ArrayIntro;

public class RotateLeft {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int d = 1;
		
		for (int i = 0; i < d; i++) {
			leftRotateByOne(arr, 1, arr.length);
		}
		//display array
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void leftRotateByOne(int[] arr, int d, int size) {
		int i, temp;
		temp = arr[0];

		for (i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

}
