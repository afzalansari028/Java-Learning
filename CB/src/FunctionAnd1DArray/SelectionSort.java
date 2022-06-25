package FunctionAnd1DArray;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {7,5,6,4,1,2};
      selectionSort(a);
   //   display(a);
	}

	public static void selectionSort(int a[]) {
		
		for (int i = 0; i < a.length-1; i++) {
			    int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					 min = j;
				}
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
	    }
		for(int item : a) {
			System.out.print(item+" ");
		}
	}

}
