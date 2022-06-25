package OopsAndStack.Stack;

public class reverseStack {

	public static void main(String[] args) throws Exception {

      StackUsingArrays stack = new StackUsingArrays(5);
       for(int i=1;i<=5;i++) {
    	   stack.push(i*10);
       }
       stack.display();
      
       StackUsingArrays helper = new StackUsingArrays(5);
          reversestack(stack,helper,0);
          stack.display();
	}
	 public static void reversestack(StackUsingArrays stack,StackUsingArrays helper,int index) throws Exception {
		  if(stack.isEmpty()) {
			  return;
		  }
		  int item = stack.pop();
		  reversestack(stack,helper,index+1);
		  
		   helper.push(item);
		    if(index == 0) {
		    while(!helper.isEmpty()) {
		    	stack.push(helper.pop());
		    }
		   }
	 }
   
}
