package OopsAndStack.Inheritance;

public class Client1 {

	public static void main(String[] args) {
		System.out.println("-- case 1 --");
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		
		obj1.fun();
		obj1.fun1();
		
		System.out.println("-- case 2 --");
		P obj2 = new C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2);
		
		obj2.fun();
		obj2.fun1();
		
//		System.out.println("-- case 3 --");
//		C obj3 = new P(); // java not support
//		System.out.println(obj2.d);
//		System.out.println(obj2.d1);
//		
//		obj2.fun();
//		obj2.fun1();
		
		System.out.println("-- case 4 --");
		C obj4 = new C();
		System.out.println(obj4.d);
		System.out.println(((P)obj4).d); // by casting we can print 10 also.
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		
		obj4.fun();
		obj4.fun1();
		obj4.fun2();
	}

}
