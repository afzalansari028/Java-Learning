package OopsAndStack.ExceptionHandling;

public class Client2 {

	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		Student s1 = new Student();
		
		try {
			s1.setAge(20);
		}
		catch(Exception e) {
			System.out.println("Age cannot be negative");	
		}
		System.out.println("bye");

	}

}
