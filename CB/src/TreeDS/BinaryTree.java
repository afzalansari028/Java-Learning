package TreeDS;
import java.util.*;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
		
	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left; 
		this.right = right;
	  }
    }
	 private Node root = null;
	 private int size = 0;
	 
	 BinaryTree() {
		Scanner s = new Scanner(System.in); 
		this.root = takeInput(s,null,false);
	 }
	 
	 private Node takeInput(Scanner s, Node parent, boolean isLeftorRight) {
		 if(parent == null) {
			 System.out.println("Enter the data for root node");
		 }
		 else {
			 if(isLeftorRight) {
				 System.out.println("Enter the data for left child of "+parent.data);
			 }
			 else {
				 System.out.println("Enter the data for right child of "+parent.data);
			 }	 
		 }
		 int nodeData = s.nextInt();
		 Node node = new Node(nodeData,null,null);
		 size++;
		 
		 boolean choice = false;
		 System.out.println("Do you have left child of "+node.data);
		 choice = s.nextBoolean();
		 if(choice) {
		   node.left = takeInput(s, node, true);
		 }
		 
		   choice = false;
		 System.out.println("Do you have right child of "+node.data);
		 choice = s.nextBoolean();
		 if(choice) {
		   node.right = takeInput(s, node, false);
		 }
		return node; 
	 }
	 
	 public void display() {
		 this.display(this.root);
	 }
	 private void display(Node node) {
		 String str = "";
		 if(node.left != null) {
			 str = str + node.left.data+"=>";
		 }
		 else {
			 str = str + "END=>";
		 }
		 str = str + node.data;
		 
		 if(node.right != null) {
			 str = str + "<="+node.right.data;
		  }
		 else {
			 str = str + "<=END";
		 }
		 System.out.println(str);
		  if(node.left != null) {
			  this.display(node.left);
		  }
		  if(node.right != null) {
			  this.display(node.right);
		  }
	 }

//	 Height of Binary tree
	public int height() {
		return this.height(this.root);
	}
	private int height(Node node) {
		if(node == null) {
			return -1;
		}
		
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		
		int height = Math.max(lheight, rheight) + 1;
		return height;
	}
	
	//PREORDER TRAVERSAL
	public void preOrder() {
		this.preOrder(this.root);
		System.out.print("END");
		System.out.println();
	}
	private void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+",");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//POSTORDER TRAVERSAL
	public void postOrder() {
		this.postOrder(this.root);
		System.out.print("END");
		System.out.println();
	}
	private void postOrder(Node node) {
		if(node == null) {
			return;
		}
		preOrder(node.left);
		preOrder(node.right);
		System.out.print(node.data+",");
	}
	
	//INORDER TRAVERSAL
	public void inOrder() {
		this.inOrder(this.root);
		System.out.print("END");
		System.out.println();
	}
	private void inOrder(Node node) {
		if(node == null) {
			return;
		}
		preOrder(node.left);
		System.out.print(node.data+",");
		preOrder(node.right);
	}
	
	//level Order Traversal
	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		 queue.add(this.root);
		 while(!queue.isEmpty()) {
			 Node rv = queue.removeFirst();
			 System.out.print(rv.data+",");
			 
			 if(rv.left != null) {
				 queue.addLast(rv.left);
			 }
			 if(rv.right != null) {
				 queue.addLast(rv.right);
			 }
		 }
		 System.out.print("END");
		 System.out.println();
	}
	
//	Check Binary Search Tree or not
	public boolean isBST() {
		return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private boolean isBST(Node node, int min, int max) {
		if(node == null) {
			return true;
		}
		if(node.data > max || node.data < min) {
			return false;
		}
		else if(!this.isBST(node.left,min, node.data)) {
		  return false;
		}
		else if(!this.isBST(node.right, node.data, max)) {
			return false;
		}
		return true;
	}
	
	//Diameter of the binary tree
		public int diameter() {
			return this.diameter(this.root);
		}
		private int diameter(Node node) {
		 if(node == null) {
			 return 0;
		 }
		 int case1 = height(node.left) + height(node.right) + 2;
		 int case2 = diameter(node.left);
		 int case3 = diameter(node.right);
		 
		 int myans = Math.max(case1, Math.max(case2, case3));
		 
		 return myans;
		}
		
//		Diameter in better approach i.e,O(n) time
		public int diameterBtr() {
			return this.diameterBtr(this.root).diameter;
		}
		private DiaPair diameterBtr(Node node) {
			if(node == null) {
				DiaPair bp = new DiaPair(-1,0);
				return bp;
			}
			DiaPair lp = this.diameterBtr(node.left);
			DiaPair rp = this.diameterBtr(node.right);
			
			DiaPair mp = new DiaPair();
			mp.height = Math.max(lp.height,rp.height)+1;
			mp.diameter = Math.max(lp.height + rp.height+2, Math.max(lp.diameter,rp.diameter));
			
			return mp;
			}
		
		public class DiaPair {
			int height;
			int diameter;
			
			DiaPair() {
				
			}
			DiaPair(int height, int diameter) {
				this.height = height;
				this.diameter = diameter;
			}
		}
		
//		Sum of all leaf nodes
		public int sumLeaf() {
			return this.sumLeaf(this.root);
		}
		private int sumLeaf(Node node) {
			if(node == null) {
				return 0;
			}
			if(node.left == null && node.right == null) {
				return node.data;
			}
			int lsum = sumLeaf(node.left);
			int rsum = sumLeaf(node.right);
			return lsum + rsum;
		}
}
