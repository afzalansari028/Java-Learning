package Queues;

public class QueueUsingArrayClient {

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray();
		
		
//			queue.enqueue(10);
//			queue.enqueue(20);
//			queue.enqueue(30);
//			queue.enqueue(40);
		 for(int i=1;i<=3;i++) {
			 queue.enqueue(i*10);
		 }
		 
		   queue.display();
		   queue.dequeue();
		   System.out.println();
		   queue.display();
		 	
		 	//queue.display();
     		//System.out.println(queue.dequeue());
//		 	System.out.println(queue.size());
		    
	
	 }

}
