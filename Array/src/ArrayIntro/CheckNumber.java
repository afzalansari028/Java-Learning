package ArrayIntro;

public class CheckNumber {

	public static void main(String[] args) {
		int n = 10;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(checkNum(arr, n));
	}

	public static boolean checkNum(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i])
				return true;
		}
		return false;
	}

}
