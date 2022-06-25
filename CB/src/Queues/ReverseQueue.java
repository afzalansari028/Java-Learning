package Queues;
//import java.util.*;
public class ReverseQueue {

	public static void main(String[] args) {
	 QueueUsingArray queue = new QueueUsingArray();
	  for(int i=1;i<=6;i++) {
		  queue.enqueue(i*10);
	  }
	  System.out.print("Original queue : ");
	   queue.display(); //original queue.
	     reverseQueue(queue);
	     System.out.println();
	  System.out.print("Reversed queue : ");   
	   queue.display(); //reversed queue.  

	}
	public static void reverseQueue(QueueUsingArray queue) {
		 if(queue.isEmpty()) {
			 return;
		 }
		int element = queue.dequeue();
		 reverseQueue(queue);
		 queue.enqueue(element); 
	}

}
