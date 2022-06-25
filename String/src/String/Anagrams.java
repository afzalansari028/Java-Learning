package String;

public class Anagrams {
	public static void main(String[] args) {
		String A = "";
		String B = "";
		String s1 = "aab";
		String s2 = "abc";
		String a[] = s1.split("");

		for (int i = 0; i <= s1.length() - 1; i++) {
			
			for (int j = i + 1; j <= s1.length() - 1; j++) {
				
				if (a[i].compareTo(a[j]) > 0) {
					
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]);
			A = a[i];
		}

		System.out.println();

//		 String s2 = "ababa";
		String b[] = s2.split("");
		for (int i = 0; i <= s2.length() - 1; i++) {
			
			for (int j = i + 1; j <= s2.length() - 1; j++) {
				
				if (b[i].compareTo(b[j]) > 0) {
					
					String temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
			System.out.print(b[i]);
			B = b[i];
		}
		System.out.println();

		if (A.equals(B)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}

}
