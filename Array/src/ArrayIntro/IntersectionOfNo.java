package ArrayIntro;

public class IntersectionOfNo {
	
	public static void main(String[] args) {
		
		int arr1[] = { 1, 3, 2, 4, 5, 6,4,4};
		int[] newArray = new int[arr1.length];
		int arr2[] = { 4, 5, 12, 9, 8, 7 };
		
		newArray = distinctEle(arr1);
		
//		CommonElements(newArray,arr2);
		
	}
	
		public static void CommonElements(int arr1[],int arr2[]) {
			
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.print(arr1[i] + ",");

				}
			}
		 }
	  }
		public static int[] distinctEle(int arr[]) {

			int i,j,k=0;
			int val[] = new int[arr.length];
		  for (i = 0; i < arr.length; i++) {
			  
			  for (j = 0; j <= i; j++) {

					if (arr[i] == arr[j]) {
						break;
					}
				}
				if (i == j) {
			     val[k] = arr[i];
			     k++;
				}
			}
		  return val;
		}

}
