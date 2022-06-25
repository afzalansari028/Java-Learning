package HashingAndTries;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxFrequencyVal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxFrequency(arr));
		
	}
	public static int maxFrequency(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int a1 = arr[i];
			if(map.containsKey(a1)) {
				int ov = map.get(a1);
				int nv = ov + 1;
				map.put(a1, nv);
			}
			else {
				map.put(a1, 1);
			}
		}
			
			int ans = 0;
			int max = 0;
			
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		  for(Map.Entry<Integer, Integer> entry : entries) {
			  if(entry.getValue() > max) {
				  max = entry.getValue();
				  ans = entry.getKey();
			  }
		  }
		return ans;
	}

}
