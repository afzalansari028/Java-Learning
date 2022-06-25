package Queues;

public class CircularArrayQueueClient {

	public static void main(String[] args) {
		
		CircularArrayQueue queue = new CircularArrayQueue(7);
//               queue.enqueue(1);
//              System.out.println(queue.getFront());
//               queue.enqueue(2);
//               queue.enqueue(3);
               
//               queue.dequeue();
//               
//               queue.display();
		for(int i=1;i<=4;i++) {
			queue.enqueue(i*10);
		}
		queue.display();
		System.out.println(queue.size());
		
//		while(!queue.isEmpty()) {
//			System.out.print(" "+queue.getFront());
//			 queue.dequeue();
//		}
		
		
	}

}
