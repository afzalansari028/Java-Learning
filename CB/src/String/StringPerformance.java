package String;

public class StringPerformance {

	public static void main(String[] args) {

		
		long start = System.currentTimeMillis();
		appendString(100000);
//		stringAppendSB(100000); faster...
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

	public static void appendString(int n) {
		String s = " ";
		for (int i = 0; i <= n; i++) {
			s = s + i;
		}
	}
	
// To overcome of this we can use StringBuilder
	 
	 public static void stringAppendSB(int n) {
		 
		 String s = " ";
		 
		 StringBuilder sb = new StringBuilder(s);
		 for(int i=0;i<n;i++) {
			 sb = sb.append(i);
		 }
	 }

}
