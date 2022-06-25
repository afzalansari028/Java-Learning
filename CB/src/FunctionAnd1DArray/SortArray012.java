package FunctionAnd1DArray;

public class SortArray012 {

	public static void main(String[] args) {
		int arr[] = {0,1,1,2,0,1,1,2};
		int ans[] = sortA(arr);
		display(ans);
	}	
		
	public static int[] sortA(int arr[]) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
	while(mid <= high) {	
		if(arr[mid] == 0) {
			swap(arr,low,mid);
			low++;
			mid++;
		}
		if(arr[mid] == 1) {
			mid++;
		}
		else {
			swap(arr,mid,high);
			high--;
		}
	}
		return arr;
	}
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		   arr[i] = arr[j];
		   arr[j] = temp;
	}
  	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
