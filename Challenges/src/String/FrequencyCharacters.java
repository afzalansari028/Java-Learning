package String;

public class FrequencyCharacters {

	public static void main(String[] args) {
		
		String str = "Afzal Ansari";
		str.toLowerCase();
		int max = 0;
		int count = 0;
		char ch='\0';
		//System.out.println("Character \t frequency");
		for(ch='a'; ch<='z'; ch++) {
	
			for(int i=0; i<str.length(); i++) {
				
				if(ch == str.charAt(i))
					count++;
			}
		}
			if(ch > max) {
			max = count;
			}
			System.out.println(ch);
	}

}
