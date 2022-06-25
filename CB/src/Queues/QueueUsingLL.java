package Queues;
import java.util.LinkedList;
public class QueueUsingLL {
     
	LinkedList<Integer> queue;
	
	QueueUsingLL() {
		queue = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(int data) {
		queue.addLast(data);
	}
	
	public void dequeue() {
		queue.removeFirst();
	}
	
	public int getFront() {
		return queue.getFirst();
	}
	
}
