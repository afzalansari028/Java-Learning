package Queues;
import OopsAndStack.Stack.StackUsingArrays;
public class QUSdequeueEfficientClient {

	public static void main(String[] args) throws Exception{
		QUSdequeueEfficient queue = new QUSdequeueEfficient();
		
		for(int i=1;i<=5;i++) {
			queue.enqueue(i*10);
		}
		  
		 queue.display();
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front());
	}

}
