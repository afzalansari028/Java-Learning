package ArrayIntro;

public class Intersection {

	public static void main(String[] args) {
	int[] A = {1,2,5,2,7,4,3}; 	
	int[] B = {1,5,2,9,10,4,3};
	int m = A.length;
	int n = B.length;
	
	Intersection(A,B,m,n);

	}
	public static void Intersection(int[] A, int[] B , int m, int n) {
		 
		
		for(int i=0;i<A.length;i++) {
			
			for(int j=0;j<B.length;j++) {
				
				if(A[i] == B[j]) {
					System.out.print(A[i]+" ");
				}
			}
		}
	}

}
