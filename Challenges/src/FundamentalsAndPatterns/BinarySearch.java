package FundamentalsAndPatterns;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 5, 7, 10, 12, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80, 90 }; // sorted array

		System.out.println(binarySearch(array, 55));

	}

	public static int binarySearch(int arr[], int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] < item) {
				low = mid + 1;
			}
			else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid; // mid = index value at item is present.
			}

		}
		return -1; // item does not exist.
	}

}
