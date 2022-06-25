package ArrayIntro;

public class NextGreaterElement {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 3, 8, 6, 7, 5 };

		for (int i = 0; i < arr.length; i++) {

			int val = -1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[i]) {
					val = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + " --- " + val);
		}
	}

}