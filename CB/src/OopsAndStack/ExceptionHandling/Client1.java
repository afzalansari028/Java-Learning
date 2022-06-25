package OopsAndStack.ExceptionHandling;

public class Client1 {

	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student();
		  s1.setAge(-10);
		System.out.println(s1.getAge());
	}

}
