package String;

public class CountString {

	public static void main(String[] args) {
//		String str = "The he     man    ";

//		String str2[] = str1.split("\\s+");
//
//		int count = str2.length;
//		System.out.println(count);
//		System.out.println(WordCount(str));
		
		String str = "this is my website      website website";
		String target = "website";
		System.out.println(targetWordCount(str, target));

	}

	// second approach
	public static int WordCount(String str) {

		if(str.length() == 0) {
			return 0;
		}
		int wordcount = 1;
		
		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == ' ' && i < str.length()-1 && str.charAt(i+1) != ' ') {
                 
				wordcount++;
		  }
		}
		return wordcount;
	}
	
	public static int targetWordCount(String str, String target) {
		
		String[] string = str.split(" ");
		int count = 0;
		for(int i=0;i<string.length;i++) {
			if(string[i].equals(target)) {
				count++;
			}
		}
		return count;
	}

}
