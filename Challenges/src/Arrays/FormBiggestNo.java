package Arrays;
import java.util.*;

public class FormBiggestNo {
	
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		        int t = sc.nextInt();

		        while (t > 0) {
		            int n = sc.nextInt();

		            int[] arr = new int[n];

		            for (int i = 0; i < arr.length; i++) {
		                arr[i] = sc.nextInt();
		            }

		            sort(arr);

		            display(arr);
		            t--;
		        }
		    }

		    public static void display(int[] arr) {

		        for (int val : arr) {
		            System.out.print(val + "");
		        }
		        System.out.println();
		    }

		    public static int[] takeInput() {
		        Scanner sc = new Scanner(System.in);
				int len = sc .nextInt();
		        int[] arr = new int[len];
		        for (int i = 0; i < len; i++) {
		            arr[i] = sc.nextInt();
		        }
		        return arr;
		    }

		    public static void sort(int[] arr) {
		        for (int i = 0; i < arr.length - 1; i++) {
		            for (int j = 0; j < arr.length - i - 1; j++) {
		                if (compare(arr[j], arr[j + 1]) > 0) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
		    }

		    public static int compare(int n1, int n2) {
		        String val1 = n1 + "" + n2;
		        String val2 = n2 + "" + n1;

		        int val1int = Integer.valueOf(val1);
		        int val2int = Integer.valueOf(val2);

		        if (val1int > val2int)
		            return -1;
		        else
		            return 1;
		    }
}
