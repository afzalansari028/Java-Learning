package String;

public class findLength {

	public static void main(String[] args) {
		
		String str = "RaziaSultan";
		int length = 0;
		char c[] = str.toCharArray();
		
		for(char c1 : c) {
			length++;
		}
		System.out.println("Length is : " +length);

	}

}
