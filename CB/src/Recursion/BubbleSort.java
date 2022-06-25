package Recursion;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {50,40,60,30,20,10};
		int si = 0;
		int li = arr.length-1;
		bubbleSort(arr,si,li);
		
		for(int val : arr) {
		System.out.print(val+" ");
		}

	}
	public static void bubbleSort(int arr[],int si,int li) {
		if(li == 0) {
			return;
		}
		if(si == li) {
			bubbleSort(arr, 0, li-1);
			return;
		}
		if(arr[si] > arr[si+1]) {
			
			int temp = arr[si];
			 arr[si] = arr[si+1];
		       arr[si+1] = temp;
		}
		bubbleSort(arr,si+1,li);
	 }

}
