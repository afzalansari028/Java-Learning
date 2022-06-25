package Queues;

public class QUSenqueueEfficientClient {

	public static void main(String[] args) throws Exception{
		QUSenqueueEfficient queue = new QUSenqueueEfficient();
               queue.enqueue(10);
               queue.enqueue(20);
               queue.enqueue(30);
               queue.enqueue(40);
               queue.enqueue(50);
               
               
               queue.display();
               
               System.out.println(queue.dequeue());
               
               queue.display();
               System.out.println(queue.front());
	}

}
