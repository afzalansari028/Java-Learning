package LinkedList;

import linkedList.LinkedList;
import java.util.Scanner;

public class KthElementFromLast {
   
	private class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	
	public int kthNodeFromLast(int k) {
		if(k <= 0) {
			System.out.println("invalid input");
		}
		Node slow = this.head;
		Node fast = this.head;
		
		for(int i=1;i<=k;i++) {
			fast = fast.next;
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	 public static void main(String args[]) {
			LinkedList list = new LinkedList();
			Scanner sc = new Scanner(System.in);
			int n = 0;
			while(n != -1) {
				n = sc.nextInt();
			}
			int k = sc.nextInt();
			list.kthNodeFromLast(k);
		}
}
