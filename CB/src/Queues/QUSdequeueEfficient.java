package Queues;

import OopsAndStack.Stack.StackUsingArrays;

public class QUSdequeueEfficient {
	
  private StackUsingArrays primary;
  private StackUsingArrays secondary;
  
  public QUSdequeueEfficient() throws Exception {
	  this.primary = new StackUsingArrays();
	  this.secondary = new StackUsingArrays();
  }
   
  public int size() {
	  return primary.size();
  }
  
  public boolean isEmpty() {
	 return  primary.size() == 0;
  }
  
  public void enqueue(int data) throws Exception {
	  while(primary.size() != 0) {
		  secondary.push(primary.pop());
	  }
	   primary.push(data);
	   while(secondary.size() != 0) {
			  primary.push(secondary.pop());
		  }
  }
  
  public int dequeue() throws Exception {
	  return primary.pop();
  }
  
  public int front() throws Exception{
	  return primary.top();
  }
  
  public void display() throws Exception {
	  primary.display();
  }

  
}
