package String;

public class stringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		   System.out.println(sb);
		   
		   sb.append("abc");
		   System.out.println(sb);
		   
		   sb.insert(2,"5");
		   System.out.println(sb);

	}

}
