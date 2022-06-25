package Queues;

import OopsAndStack.Stack.StackUsingArrays;

public class QUSenqueueEfficient {
    
	private StackUsingArrays primary;
	private StackUsingArrays secondry;

	public QUSenqueueEfficient() throws Exception{
		this.primary = new StackUsingArrays();
		this.secondry = new StackUsingArrays();
	}
	
	public int size() {
		return primary.size();
	}
	
	public boolean isEmpty() {
	  return primary.size() == 0;
	}
	
	public void enqueue(int data) throws Exception{
		 primary.push(data);
	}
	
	public int dequeue() throws Exception {
		while(primary.size() != 1) {
			secondry.push(primary.pop());
		   }
			int rv = primary.pop();
		  while(!secondry.isEmpty()) {
			  primary.push(secondry.pop());
		  }
		return rv;
	}
	
	public int front() throws Exception {
		while(primary.size() != 1) {
			secondry.push(primary.pop());
		   }
			int rv = primary.top();
		  while(!secondry.isEmpty()) {
			  primary.push(secondry.pop());
		  }
		return rv;
	}
	 
	public void display() throws Exception{
		
		reverseStack(primary,secondry,0);
		primary.display();
		reverseStack(primary,secondry,0);
		
	}
	
	 public static void reverseStack(StackUsingArrays stack,StackUsingArrays helper,int index) throws Exception {
		  if(stack.isEmpty()) {
			  return;
		  }
		  int item = stack.pop();
		  reverseStack(stack,helper,index+1);
		  
		   helper.push(item);
		    if(index == 0) {
		    while(!helper.isEmpty()) {
		    	stack.push(helper.pop());
		    }
		   }
	 }
}
