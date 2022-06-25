package DynamicProgramming;

public class NoOfBTSs {

	public static void main(String[] args) {
		int n = 70;
//	 System.out.println(NoOfBSTsRecursion(n));	
	 System.out.println(NoOfBSTsTD(n,new int[n+1]));
	 int tn = 70;
	 System.out.println(NoOfBSTsBU(tn));	
	}

	 public static int NoOfBSTsRecursion(int n) {
		 
		 if(n <= 1) {
			 return 1;
		 }
		 
		 int total = 0;
		 
		 for(int i=1;i<=n;i++) {
			 
			 int l = NoOfBSTsRecursion(i-1);
			 int r = NoOfBSTsRecursion(n-i);
			 
			 int ans = l * r;
			 
			  total = total + ans;
		 }
		 return total;
	 }
	 
//	 Apply Top Down DP
    public static int NoOfBSTsTD(int n, int strg[]) {
		 
		 if(n <= 1) {
			 return 1;
		 }
		 
		 if(strg[n] != 0) {    //  re-use
			 return strg[n];
		 }
		 int total = 0;
		 
		 for(int i=1;i<=n;i++) {
			 
			 int l = NoOfBSTsTD(i-1, strg);
			 int r = NoOfBSTsTD(n-i, strg);
			 
			 int ans = l * r;
			 
			  total = total + ans;
		 }
		 strg[n] = total;              //  store
		 return total;
	 }
    
//    Apply Bottom UP DP
    public static int NoOfBSTsBU(int tn) {
    	
    	int strg[] = new int[tn+1];
    	strg[0] = 1;
    	strg[1] = 1;
    	 
      for(int n=2;n<strg.length;n++) {
    	  
          int total = 0;
		 
		 for(int i=1;i<=n;i++) {
			 
			 int l = strg[i-1];
			 int r = strg[n-i];
			 
			 int ans = l * r;
			 
			  total = total + ans;
		 }
		 strg[n] = total;
    }
      return strg[tn];
    }
}
