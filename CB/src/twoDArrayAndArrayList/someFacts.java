package twoDArrayAndArrayList;

public class someFacts {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[2] = new int[3];
		arr[1] = new int[2];
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		System.out.println(arr[0][3]);
         display(arr);
	}
	private static void display(int[][] arr)
	{
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
   }
}
