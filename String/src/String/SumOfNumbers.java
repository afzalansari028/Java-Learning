package String;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		int sum = 0;
		String str = "pr2ep4in5st1";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		
		}
		System.out.println(sum);
	}
}
