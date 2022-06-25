package Queues;

public class QueueUsingLLClient {

	public static void main(String[] args) {
		
	  QueueUsingLL queue = new QueueUsingLL();
	  
		for(int i=1;i<=6;i++) {
			queue.enqueue(i);
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.getFront());
			queue.dequeue();
		}

	}
}
