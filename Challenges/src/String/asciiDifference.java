package String;

public class asciiDifference {

	public static void main(String[] args) {
		String str = "acb";
		String ans = "";
		int len = str.length();
		for(int i=0; i<len-1; i++) {
			ans = ans + str.charAt(i);
		int diff = str.charAt(i+1) - str.charAt(i);
		    ans = ans + diff;
		   
//		System.out.print(ans);
		}
		System.out.print(ans);
		System.out.print(str.charAt(str.length()-1));
	}

}
