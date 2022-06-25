package ArrayIntro;

public class DistinctElements {

	public static void main(String[] args) {

		int size = 7;
		int arr[] = { 1, 2, 3, 4, 3,2, 2, 1 };
		distinctEle(size, arr);

	}

	public static void distinctEle(int size, int arr[]) {

		int i, j;

		for (i = 0; i < size; i++) {

			for (j = 0; j <= i; j++) {

				if (arr[i] == arr[j]) {
					break;
				}
			}
			if (i == j) {
				System.out.print(arr[i] + "'");
			}
		}
	}

}
