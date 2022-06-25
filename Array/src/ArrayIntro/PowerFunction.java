package ArrayIntro;

public class PowerFunction {

	public static void main(String[] args) {

		int a = 2;
		int n = 3;
		System.out.println(power(a,n-1));
		
		
	}
	public static int power(int a, int n) {
		int ans = 1;
		for(int i=0;i<n;i++) {
			 ans = ans * a;
		}
		return ans;
	}

}
