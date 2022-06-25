package Recursion;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {40,20,90,30,70,10,80,60,50};
		int lo = 0;
		int hi = arr.length-1;
		quickSort(arr,lo,hi);
		for(int item : arr) {
			System.out.print(item+" ");
		}
		
	}
	public static void quickSort(int arr[],int lo,int hi) {
		if(lo >= hi) {
			 return;
		}
		int mid = (lo + hi)/2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		
		while(left <= right) {
			
			while(arr[left] < pivot) {
				left++;
			}
			while(arr[right] > pivot) {
				right--;
			}
		  if(left <= right) {
			int temp = arr[left];
		    arr[left] = arr[right];
		    arr[right] = temp;
		    
		    left++;
		    right--;
		}
	  }
		  quickSort(arr,lo,right);
		  quickSort(arr,left,hi);
  }
}
