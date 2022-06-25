package LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		  list.addFirst(20);
		  list.addFirst(10);
		  
		  
		  list.addLast(30);
		  list.addLast(40);
		  list.addLast(50);
		  
		  list.display();
		  System.out.println();
//		  System.out.println(list.getFirst());
//		  System.out.println(list.getLast());
//		  System.out.println(list.getAt(3));
		  
//		  list.addAt(0, 100);
//		  list.display();
//		  System.out.println(list.removeFirst());
//		  System.out.println(list.removeLast());
//		  list.display();
//		  System.out.println(list.removeAt(0));
		  
//		  list.reverseData();
		  
//		  list.reversePointers();  not wprking properly.
		  
//		  System.out.println(list.mid());
		  System.out.println(list.kthNodeFromEnd(4));
		 

	}

}
