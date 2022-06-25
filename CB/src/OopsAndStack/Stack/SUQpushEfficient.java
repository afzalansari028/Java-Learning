package OopsAndStack.Stack;

import Queues.CircularArrayQueue;

public class SUQpushEfficient {
    private CircularArrayQueue primary;
    private CircularArrayQueue secondary;
    
    public SUQpushEfficient() {
    	this.primary = new CircularArrayQueue();
    	this.primary = new CircularArrayQueue();
    }
    
    public int size() {
    	return primary.size();
    }
    
    public boolean isEmpty() {
    	return primary.size() == 0;
    }
    
    public void push(int data) {
    	primary.enqueue(data);
    }
    
    public int pop() {
    	while(this.primary.size() != 1) {
    		this.secondary.enqueue(this.primary.dequeue());
    	}
    	int rv = this.primary.dequeue(); //popping
    	while(secondary.size() != 0) {
    		this.primary.enqueue(this.secondary.dequeue());
    	}
    	return rv;
    }
    
    public int top() {
    	while(this.primary.size() != 1) {
    		this.secondary.enqueue(this.primary.dequeue());
    	}
    	int rv = this.primary.dequeue(); //element poppedd
    	 secondary.enqueue(rv);
    	while(secondary.size() != 0) {
    		primary.enqueue(secondary.dequeue());
    	}
    	return rv;
    }
    
//    public void display() {
//    	reverseQueue(this.primary);
//    	primary.display();
//    	reverseQueue(this.primary);
//    }
    
//    private static void reverseQueue(CircularArrayQueue queue) {
//    	 if(queue.isEmpty()) {
//    		 return;
//    	 }
//    	int element = queue.dequeue();
//    	 reverseQueue(queue);
//    	   queue.enqueue(element);
//    }
    
}
