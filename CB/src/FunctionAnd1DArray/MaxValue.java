package FunctionAnd1DArray;

public class MaxValue {

	public static void main(String[] args) {
		int a[] = {1,3,4,8,2,6,};
        System.out.println(max(a));
	}
	public static int max(int a[]) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}

}
