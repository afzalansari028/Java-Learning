package ArrayIntro;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your elements");
		 int arr[] = new int[10];
		 for(int i=0;i<10;i++) {
			 arr[i] = sc.nextInt();
		 }
		 for(int i=0;i<10;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

}
