package ArrayIntro;

public class NegativeLeftPositiveRight {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,-2,6,-1};
		
		int l = 0;
		int r = arr.length-1;
		
		int temp[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] < 0) {
				
				temp[l] = arr[i];
				l++;
			}
			else {
				temp[r] = arr[i];
				r--;
			}
		}
		for(int ans : temp) {
			System.out.print(ans+" ");
		}

	}

}
