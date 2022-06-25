package LinkedList;

public class LL_As_Stack_CLIENT {

	public static void main(String[] args) throws Exception {
		
		LL_As_Stack stack = new LL_As_Stack();
		
		   stack.push(10);
		   stack.push(20);
		   stack.push(30);
		   stack.push(40);
		   
		   stack.display();
		   
//		   System.out.println(stack.pop());
//		   System.out.println(stack.top());
		   
//		   System.out.println(stack.isEmpty());
//		   System.out.println(stack.size());
		   
		   stack.pop();
		   System.out.println();
	       stack.display();
	}

}
