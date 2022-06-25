package FunctionAnd1DArray;

public class InsersionSort {

	public static void main(String[] args) {
		int a[] = {88,55,44,33,12,23};
		insertionSort(a);

	}
	public static void insertionSort(int a[]) {
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > temp)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		for(int item : a)
		System.out.print(item+" ");
	}

}
