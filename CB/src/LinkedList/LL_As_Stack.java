package LinkedList;

public class LL_As_Stack {

	private LinkedList stack;
	
	public LL_As_Stack() {
		this.stack = new LinkedList();
	}
	
	public int size() {
		return this.stack.size();
	}
	
	public boolean isEmpty() {
	  return this.stack.size() == 0;
	}
	
	public void push(int data) {
		this.stack.addFirst(data);
	}
	
	public int pop() throws Exception {
		return this.stack.removeFirst();
	}
	
	public int top() throws Exception {
		return this.stack.getFirst();
	}
	
	public void display() {
		stack.display();
	}
}
