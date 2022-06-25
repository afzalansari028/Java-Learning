package OopsAndStack.Constructor;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		System.out.println("i am default constructor");
	}
	public Person(int age) {
		System.out.println("i am parameterised constructor with 1 parameter");
		this.age = age;
	}
	public Person(int age,String name) {
		System.out.println("i am parameterised constructor with 2 parameter");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
