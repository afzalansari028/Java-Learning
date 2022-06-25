package FunctionAnd1DArray;

public class LowerAndUpperBound {

	public static void main(String[] args) {
	int a[] = {1,2,2,2,2,3,3,3,4,4,5,6};
    int data = 3;
	System.out.println(lowerBound(a,data ));
    System.out.println(upperBound(a,data));
	}
	public static int lowerBound(int a[],int data)
	{
		int low = 0;
		int high = a.length-1;
		int ans = 0;
	   while(low <= high) {
		  int mid = (low + high)/2;
		   if(a[mid] == data) {
			   ans = mid;
			   high = mid-1;
		   }
		   else if(data < a[mid]) {
			   high = mid - 1;
		   }
		   else {
			   low = mid + 1;
		   }
	   }
	   return ans;
	}
	public static int upperBound(int a[],int data)
	{
		int low = 0;
		int high = a.length-1;
		int ans = 0;
	   while(low <= high) {
		  int mid = (low + high)/2;
		   if(a[mid] == data) {
			   ans = mid;
			   low = mid+1;
		   }
		   else if(data < a[mid]) {
			   high = mid - 1;
		   }
		   else {
			   low = mid + 1;
		   }
	   }
	   return ans;
	}
}
