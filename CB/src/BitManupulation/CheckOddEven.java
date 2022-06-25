package BitManupulation;

public class CheckOddEven {

	public static void main(String[] args) {
		int n = 15006;
		if((n & 1)==0){
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

}
