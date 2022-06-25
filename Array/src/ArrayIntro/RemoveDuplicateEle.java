package ArrayIntro;

import java.util.Arrays;

public class RemoveDuplicateEle {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,4,5,6};
		
		removeDuplicate(arr);

	}
	
	public static void removeDuplicate(int arr[]) {
		
//		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
//		}
		
		int len = arr.length;
		int temp[] = new int[arr.length];
		int k = 0;
	
		for(int i=0;i<len-1;i++) {
			
			if(arr[i] != arr[i+1]) {
			   temp[k++] = arr[i];
			}
		}
		
		temp[k++]= arr[len-1];
		 
		for(int j=0; j<k; j++) {
			System.out.print(temp[j]+" ");
		}	
		
	}

}
