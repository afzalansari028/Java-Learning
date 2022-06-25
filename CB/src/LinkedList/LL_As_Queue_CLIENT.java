package LinkedList;

public class LL_As_Queue_CLIENT {

	public static void main(String[] args) throws Exception {
	
		LL_As_Queue queue = new LL_As_Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		queue.display();
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
		
		System.out.println(queue.dequeue());
		
//		queue.display();
		
//		System.out.println(queue.front());
	}

}
