package Queues;

public class CircularArrayQueue {
    private int[] Queue;
    private int cs;
    private int ms;
    private int front;
    private int rear;

    public static int DEFAULT_CAPACITY = 10;
    
    public CircularArrayQueue() {
    	this(DEFAULT_CAPACITY);
    }
    
    public CircularArrayQueue(int capacity) {
    	this.Queue = new int[capacity];
    	this.cs = 0;
    	this.ms = capacity;
    	this.front = 0;
    	this.rear = capacity-1;
    }
    
    public int size() {
    	return cs;
    }
    public boolean isFull() {
    	return cs == ms; 
    }
    public boolean isEmpty() {
    	return cs == 0;
    }
    
    public void enqueue(int data) {
    	if(!this.isFull()) {
    		this.rear = (this.rear+1) % this.Queue.length;
    		this.Queue[this.rear] = data;
    		cs++;
    	}
    }
    
    public int dequeue() {
    	if(!this.isEmpty()) {
    		this.front = (this.front+1) % this.Queue.length;
    		cs--;
    	}
    	return Queue[this.front];
    }
    
    public int getFront() {
    	return this.Queue[this.front];
    }
    
    public void display() {
    	for(int i=front;i<(rear+1)%Queue.length;i++) {
    		System.out.print(Queue[i]+" ");
    	}
    }

      
}
