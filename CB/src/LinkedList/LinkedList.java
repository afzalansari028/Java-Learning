package LinkedList;

public class LinkedList {
	
	private class Node {
		int data;
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
	
	public void addFirst(int item) {
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
	
	public void addLast(int item) {
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

	public int getFirst() throws Exception {
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}
	
	public int getLast() throws Exception {
		if(this.size == 0) {
			
		}
		return this.tail.data;
	}
	
	public int getAt(int idx) throws Exception {

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
	
	public void addAt(int idx,int item) throws Exception {
	
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
		
		public int removeFirst() throws Exception {
			
			if(this.size == 0) {
				throw new Exception("LL is Empty.");
		    }
			int rv = this.head.data;
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
		
		public int removeLast() throws Exception {
			if(this.size == 0) {
				throw new Exception("LL is Empty.");
		    }
			
			int rv = tail.data;
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
		
		public int removeAt(int idx) throws Exception {
			
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
           
		public void reverseData() throws Exception {
			
			int left = 0;
			int right = size-1;
			while(left < right) {
				
				Node ln = getNodeAt(left);
				Node rn = getNodeAt(right);
				
				int temp = ln.data;
				ln.data = rn.data;
				rn.data = temp;
				
				left++;
				right--;
			}
			
		}
		
	   public void reversePointers() throws Exception{
			
			Node prev = this.head;
			Node curr = prev.next;
			
		  while(curr != null) {
			  
			  Node ahead = curr.next;
			  
			  curr.next = prev;
				prev = curr;
				curr = ahead;
			}
		  // swap
		    Node temp = this.head;
		    this.head = this.tail;
		    this.tail = temp;
			 
		    this.tail = null;
		}
	   
	   public int mid() {
		   
		   Node slow = head;
		   Node fast = head;
		   
		   while(fast.next != null && fast.next.next != null) {
			   slow = slow.next;
			   fast = fast.next.next;
		   }
		   return slow.data;
	   }
	   
	   public int kthNodeFromEnd(int k) throws Exception {
		   if(k < 0 || k > size) {
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
	
}

