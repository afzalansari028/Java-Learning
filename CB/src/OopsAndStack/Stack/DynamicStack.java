package OopsAndStack.Stack;
//import StackUsingArrays;

public class DynamicStack extends StackUsingArrays{
	public DynamicStack() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}
	
	public void push(int item) throws Exception {
		if(this.size() == this.data.length) {
			int arr[] = new int[2*this.data.length];
			 for(int i=0;i<this.size();i++) {
				 arr[i] = this.data[i];
			 }
			this.data = arr; 
		}
		super.push(item);
	}
	public void display() throws Exception {
		 if(this.size() == 0) {
			 throw new Exception("Stack is empty");
		 }
		 for(int i=this.top;i>=0;i--) {
			 System.out.print(this.data[i]+", ");
		 }
		 System.out.println("END");
	}

}
