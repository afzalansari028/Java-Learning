package twoDArrayAndArrayList;

public class RowWithMaxSum {

	public static void main(String[] args) {
		int arr[][] = {
			        	{1,2,3},
				        {4,5,6},
				        {7,8,9},
	         	      };
		rowSum(arr);

	}
	
	public static void rowSum(int arr[][]) {
		
        int sum = 0;
        int RowMax = 0;
        int i;
		for(i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				sum = sum + arr[i][j];
				}
			
			System.out.println("Row "+i+" : " +sum);
			 if(sum > RowMax) {
				 RowMax = sum;
			 }
			sum = 0;
		}
		System.out.println("Row "+i+" is having the maximum sum "+RowMax);
	}	

}
