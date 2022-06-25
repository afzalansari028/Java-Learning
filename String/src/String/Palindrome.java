package String;

public class Palindrome {

	public static void main(String[] args) {
		String s = "aabbbaa";
		
		System.out.println(isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s) {
		String str[] = s.split("");
		int l = 0;
		int r = str.length-1;
		boolean IsPalindrome = true;
		while(l < r) {
//			if(s.charAt(l) != s.charAt(r)) {
			if(str[l] != str[r]) {
				IsPalindrome = false;
			}
			l++;
			r--;
		}
		if(IsPalindrome) {
			return true;
		}
		return false;
	}

}
