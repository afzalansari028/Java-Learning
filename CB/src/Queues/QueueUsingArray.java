package Queues;

public class QueueUsingArray {
	int capacity = 20;
	int Queue[] = new int[capacity];
    int front = 0;
    int rear = 0;
    int count = 0;
     
    public boolean isFull() {
  	  return size() == capacity; 
  	  }

    public boolean isEmpty() {
    	return size() == 0;
    }
    
    public int size() {
    	return count;
    }
    public void enqueue(int data) {
    	if(isFull()) {
    		System.out.println("Queue is full");
    	}
    	Queue[rear] = data;
    	rear++;
    	count++;
    }
    
    public int dequeue() {
    	if(isEmpty()) {
    		System.out.println("Queue is empty");
    	}
    	int rv = Queue[front];
    	front++ ;
    	count--;
    	return rv;
    }
    
    public void display() {
    	for(int i=front;i<rear;i++) {
    		System.out.print(Queue[i]+" ");
    	}
    	
    	
    	
    	
    }
}
