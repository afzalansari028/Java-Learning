package OopsAndStack;

public class PersonClient {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1.getName());
		System.out.println(p2.getAge());
		
		p2.setName("King");
		p2.setAge(21);
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
	}

}
