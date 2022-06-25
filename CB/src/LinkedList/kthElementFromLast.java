package LinkedList;
import java.util.LinkedList;

public class kthElementFromLast extends LinkedList {
	
	private class Node {
		int data;
		Node next;
	}
    private Node head;
	public int kthNodeFromEnd(int k) throws Exception {

		   if(k < 0 || k > size()) {
			   throw new Exception("Invalid index.");
		   }
		   Node slow = this.head;
		   Node fast = this.head;
		   
		   for(int i=1; i<=k; i++) {
			   fast = fast.next;
		   }
		   
		   while(fast != null) {
			   slow = slow.next;
			   fast = fast.next;
		   }
		   return slow.data;
	   }
	public void display() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) throws Exception {
		kthElementFromLast list = new kthElementFromLast();
		  list.addLast(1);
		  list.addLast(2);
		  list.addLast(3);
		  list.addLast(4);
		  
		  list.display();
//		  System.out.println(list.kthNodeFromEnd(2));
	}
}
