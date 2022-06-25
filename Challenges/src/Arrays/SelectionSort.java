package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 7, 4, 10, 8, 3, 1 };
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (a[minIndex] > a[j])
					minIndex = j;
			}

			// if(minIndex != i) //swap (a[i],a[min])
			{
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
		for (int i = 0; i < n; i++) // OR for(int item : a)
		{ 
			System.out.print(" " + a[i]); // System.out.print(" "+item);
		}

	}

}
