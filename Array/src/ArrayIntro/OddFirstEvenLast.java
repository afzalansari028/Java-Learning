package ArrayIntro;

public class OddFirstEvenLast {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9};
		int temp[] = new int[num.length];
		int j = 0;
		int k = num.length-1;
		for(int i=0; i<num.length; i++) 
		 {
	    	if(num[i] % 2 != 0) 
	    	{	
			 temp[j] = num[i];
			 j++;
	    	}
			 else
			 {
				 temp[k] = num[i];
				  k--;
			  }
		  }
		 CopyArray(num,temp);
	}
		public static void CopyArray(int num[],int temp[]) {
		 for(int i=0; i<num.length; i++) {
			num[i] = temp[i];
		System.out.print(" "+num[i]);
		 }
      }
}
