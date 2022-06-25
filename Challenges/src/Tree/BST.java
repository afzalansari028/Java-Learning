package Tree;
import java.util.*;
public class BST {
	 private class Node {
	        int data;
	        Node left;
	        Node right;
	    }

	    private Node root;

	    public BST(int[] in) {
	        this.root = construct(in, 0, in.length - 1);
	    }
	    private Node construct(int[] in, int lo, int hi) {

	        if (lo > hi) {
	            return null;
	        }
	        int mid = (lo + hi) / 2;

	        Node nn = new Node();
	        nn.data = in[mid];

	        nn.left = construct(in, lo, mid - 1);
	        nn.right = construct(in, mid + 1, hi);

	        return nn;
	    }

	    public void display(){
	        display(this.root);
	    }
	    public void display(Node root) {
	        if(root == null) {
	        	return;
	        }
	        System.out.print(root.data+" ");
	        display(root.left);
	        display(root.right);
	    }

	 public static void main(String[] args) {
	         int t = sc.nextInt();
	        while(t-- > 0){
	             int[] inorder = takeinput();
	             BST tree = new BST(inorder);
	             tree.display();
	        }
	 }

	 static Scanner sc = new Scanner(System.in);

	 public static int[] takeinput() {
            int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }

	        return arr;
	    }
}
