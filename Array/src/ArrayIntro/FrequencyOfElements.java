package ArrayIntro;
import java.util.Arrays;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
		int N = 8;
		int arr[] = {1,2,3,5,2,7,3,5};;
		
		frequencyOfEle(N,arr);

	}
	public static void frequencyOfEle(int N, int arr[]) {
		
		boolean visited[] = new boolean[N];
//		Arrays.fill(visited,false);
		
		for(int i=0;i<N;i++) {
			
			//skip if already processed
			if(visited[i] == true)
				continue;
			
			int count = 1;
			for(int j=i+1;j<N;j++) {
				
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i]+" --> "+count);
			count = 0;
		}
		
	}

}
