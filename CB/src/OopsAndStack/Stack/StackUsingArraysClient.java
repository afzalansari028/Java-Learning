package OopsAndStack.Stack;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		
        StackUsingArrays stack = new StackUsingArrays(5);
         System.out.println(stack.size());
         System.out.println(stack.isEmpty());
         
         for(int i=1;i<=5;i++) {
        	 stack.push(i*10);
        	 stack.display();
         }
        System.out.println(stack.pop());
         while(!stack.isEmpty()) {
            stack.display();
            stack.pop();
         }
	}

}
