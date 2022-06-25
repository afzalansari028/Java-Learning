package FundamentalsAndPatterns;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {12,23,34,32,43,65,56,76,78,21};
		int item = 65;
		int result = linearSearch(arr,item);
		System.out.println(result);
	}
	public static int linearSearch(int arr[], int item) {
	  	for(int i=0;i<arr.length;i++) {
	  		if(arr[i] == item)
	  			return 1;
	  	    }
	     return -1;
	}
}
