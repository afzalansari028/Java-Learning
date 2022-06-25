package Generics.GenericClass;

public class LinkedList<T> {
	
	private class Node {
		T data;
		Node next;
	}
	  
	private Node head;
	private Node tail;
	private int size;
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void addFirst(T item) {
//	  node creation
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		 
//	  attach node
		if(this.size >=1) {
			nn.next = head;
		}
//	  summary updation
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		}
		else {
			this.head = nn;
			 size++;
		}
	}
	
	public void addLast(T item) {
//	   node creation	
		Node nn = new Node();
		    nn.data = item;
		    nn.next = null;
		    
//		attach node
		   if(this.size >=1) {
			   this.tail.next = nn;
		   }
		   
//		 summary updation
		   if(this.size == 0) {
			   this.head =nn;
			   this.tail =nn;
			   this.size++;
		   }
		   else {
			   this.tail = nn;
			   this.size++;
		   }
		    
	}
	
	public void display() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.data+", ");
			temp = temp.next;
		}
	}

	public T getFirst() throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}
	
	public T getLast() throws Exception {
		if(this.size == 0) {
			
		}
		return this.tail.data;
	}
	
	public T getAt(int idx) throws Exception {

		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		if(idx < 0 || idx >this.size) {
			throw new Exception("Invalid index.");
		}
		Node temp = this.head;
		for(int i=0; i<idx; i++) {
			temp = temp.next;
		}
		return temp.data;
		
	}
    
	public Node getNodeAt(int idx) throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		if(idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index.");
		}
		Node temp = this.head;
		for(int i=0; i<idx; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public void addAt(int idx,T item) throws Exception {
	
		if(idx < 0 || idx > size) {
			throw new Exception("Invalid index.");
		}
	  else if(idx == 0) {
			addFirst(item);
		}
	  else if(idx == this.size) {
			addLast(item);
		}
		else {
//	create node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		Node nm1 = getNodeAt(idx-1);
		Node np1 = nm1.next;
		nm1.next = nn;
		 nn.next = np1;
		 
		 this.size++;
		}
	}
		
		public T removeFirst() throws Exception {
			
			if(this.size == 0) {
				throw new Exception("LL is Empty.");
		    }
			T rv = this.head.data;
			if(this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			}
			else {
			this.head = this.head.next;
			this.size--;
			}
			return rv;
	}
		
		public T removeLast() throws Exception {
			if(this.size == 0) {
				throw new Exception("LL is Empty.");
		    }
			
			T rv = tail.data;
			if(this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			}
			else {
				Node sizem2 = getNodeAt(size-2);
			    tail = sizem2;
				tail.next = null;
				size--;
			}
			return rv;
		}
		
		public T removeAt(int idx) throws Exception {
			
			if(this.size == 0) {
				throw new Exception("LL is Empty");
			}
			if(idx < 0 || idx >= size) {
				throw new Exception("Invalid index.");
			}
			if(idx == 0) {
				return removeFirst();
			}
			else if(idx == this.size-1) {
				return removeLast();
			}
			else {
			   Node	nm1 = getNodeAt(idx-1);
			    Node n = nm1.next;
			   Node np1 = n.next;
			   nm1.next = np1;
			   
			   this.size--;
			   return n.data;
			}
		}
		
}

