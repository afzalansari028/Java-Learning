package HeapOrPriorityQueue;

public class HeapClient {

	public static void main(String[] args) {
		
		Heap heap = new Heap();
		
		 heap.Add(10);
		 heap.display();
		 heap.Add(20);
		 heap.display();
		 heap.Add(30);
		 heap.display();
		 heap.Add(40);
		 heap.display();
		 heap.Add(5);
		 heap.display();
		 heap.Add(3);
		 heap.display();
		 
		 System.out.println();
		 
		System.out.println(heap.remove());
		 //heap.display();
		System.out.println(heap.remove());
		// heap.display();
		System.out.println(heap.remove());
		// heap.display();
	    System.out.println(heap.remove());
		 //heap.display();
		System.out.println(heap.remove());
		 //heap.display();
		

	}

}
