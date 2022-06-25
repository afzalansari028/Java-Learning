package String;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String str = "Education";
		
//		String output = str.replaceAll("[AaEeIiOoUu]","");
//		
//		System.out.print(output);
		
		String str2="";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == 'A' || str.charAt(i) == 'a' || 
				 str.charAt(i) == 'E' || str.charAt(i) == 'e' ||
					str.charAt(i) == 'I' || str.charAt(i) == 'i' ||
						str.charAt(i) == 'O' || str.charAt(i) == 'o' ||
							str.charAt(i) == 'U' || str.charAt(i) == 'u') {
				
	           //do nothing
			}
			else {
				str2 = str2 + str.charAt(i);
			}
		}
		
		System.out.print(str2);
		
	}

}
