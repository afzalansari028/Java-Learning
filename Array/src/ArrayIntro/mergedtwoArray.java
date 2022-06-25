package ArrayIntro;

public class mergedtwoArray {
	public static void main(String args[])
	{
		int[] arr1 = {1,2,3,4,5,45,45};
		int[] arr2 = {6,7,8,9,0,50,50,50};
		int[] ans = mergetwoArray(arr1,arr2);
		for(int val : ans) {
			System.out.print(val+" ");
		}
//		int merged[] = new int[arr1.length + arr2.length];
	}
	public static int[] mergetwoArray(int arr1[],int arr2[])
	{
		int merged[] = new int[arr1.length + arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			merged[k] = arr1[i];
			k++;
		}
		for(int j=0;j<arr2.length;j++) {
			merged[k] = arr2[j];
			k++;
		}
		return merged;
	}
}
