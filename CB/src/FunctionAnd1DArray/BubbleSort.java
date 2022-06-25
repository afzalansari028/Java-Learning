package FunctionAnd1DArray;

public class BubbleSort {

	public static void bubbleSort(int a[]) {
		for (int counter = 0; counter < a.length - 1; counter++) {
			for (int j = 0; j < a.length - 1 - counter; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
//		for (int item : a) {
//			System.out.print(item+" ");
//		}
	}

	public static void main(String[] args) {
		int a[] = { 88, 66, 55, 45, 23, 12 };
		 bubbleSort(a);
		 display(a);

	}
	public static void display(int a[]) {
	for (int item : a) {
		System.out.print(item+" ");
	}
	}

}
