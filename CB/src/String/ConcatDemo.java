package String;

public class ConcatDemo {

	public static void main(String[] args) {
		String s1 = "Afzal ";
		String s2 = "Ansari";
		String s3 = s1 + s2;
		System.out.println(s3);
		System.out.println(s1.concat(s2));
		System.out.println(s1.indexOf("z"));
		
		System.out.println(s1.startsWith("Af"));
		System.out.println(s1.startsWith("f"));
		System.out.println(s1.startsWith("af"));
	}

}
