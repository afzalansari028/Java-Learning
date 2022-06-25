package OopsAndStack.ExceptionHandling;

public class Student {
	private int age;
	private String name;
	
	public void setAge(int age) throws Exception{
		if(age < 1) {
			throw new Exception("Age can't be negative");
		}
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}

}
