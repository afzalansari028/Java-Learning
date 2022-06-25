package twoDArrayAndArrayList;

public class arrayDemo2D {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		display(arr);
		//System.out.println(arr);
	}
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
