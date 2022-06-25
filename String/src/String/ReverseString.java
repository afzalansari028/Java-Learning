package String;

import java.util.*;

public class ReverseString {
	public static void main(String[] args) {

		String str = "King11";

		reverseStringNormally(str);
		reverseString(str);
		System.out.println();
		reverseStringSplit(str);

	}

//   Normal method
	public static void reverseStringNormally(String str) {
		
		String rev = "";

		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Original String: ");
		System.out.println(str);
//		System.out.println("After Reverse: ");
		System.out.println(rev);
	}

//   Using toCharArray method
	public static void reverseString(String str) {

		char temp[] = str.toCharArray();
		int l = 0;
		int r = str.length() - 1;

		while (l <= r) {
			char swap = temp[l];
			temp[l] = temp[r];
			temp[r] = swap;

			l++;
			r--;
		}

		for (char i = 0; i < str.length(); i++) {
			System.out.print(temp[i]);
		}
	}

//    Using split method
	public static void reverseStringSplit(String str) {

		String s[] = str.split("");

		int left = 0;
		int right = s.length - 1;

		while (left <= right) {
			String temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;
		}

		for (String reverse : s) {
			System.out.print(reverse);
		}

	}

}
