package OopsAndStack.Constructor;

public class PersonClient {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person p3 = new Person(25);
		Person p4 = new Person(21,"Dastaan");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
	}

}
