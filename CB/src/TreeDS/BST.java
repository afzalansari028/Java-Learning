package TreeDS;

public class BST {
  private class Node {
	  int data;
	  Node left;
	  Node right;
  }
  private Node root;
  
  public BST(int arr[]) {
	 root = this.construct(arr, 0, arr.length-1);
  }
   private Node construct(int[] arr, int lo, int hi) {
	 if(lo > hi) {
		 return null;
	 }
	 int mid = (lo + hi)/2;
  // create node
	 Node nn = new Node();
	  nn.data = arr[mid];
	  
	  nn.left = construct(arr, lo, mid-1);
	  nn.right = construct(arr, mid+1, hi);
	  
	  return nn;
  }
   
   public void display() {
	   display(this.root);
   }
   private void display(Node node) {
	   if(node == null) {
		   return;
	   }
	   String str = "";
	   if(node.left == null) {
		   str = str+".";
	   }
	   else {
		   str =str + node.left.data;
	   }
	   
	   str = str +"->"+ node.data +"<-";
	   
	   if(node.right == null) {
		   str = str+".";
	   }
	   else {
		   str =str + node.right.data;
	   }
	   
	   System.out.println(str);
	   //left
	   display(node.left);
      //right
	   display(node.right);
   }
   
//   Find
   public boolean find(int item) {
	  return find(this.root,item);
   }
   
   private boolean find(Node node, int item) {
	   if(node == null) {
		   return false;
	   }
	   if(item > node.data) {
		   return find(node.right, item);
	   }
	 else if(item < node.data) {
		 return find(node.left, item);
	 }
	 else {
		 return true;
	 }
   }
   
//   add in BST
   public void add(int item) {
	   add(this.root,item);
   }
   private void add(Node node, int item) {
	 if(item > node.data) {
		 if(node.right == null) {
			 Node nn = new Node();
			 nn.data = item;
		   node.right = nn;
		  }
		 else {
			 add(node.right, item);
		     }
	 }
	 else {
		 if(node.left == null) {
			 Node nn = new Node();
			 nn.data = item;
			 node.left = nn;
		   }
		 else {
			 add(node.left, item);
		   } 
	     }
	 }
   
//   maximum in list
   public int max() {
	   return max(this.root);
   }
   private int max(Node node) {
	  if(node.right == null) {
		  return node.data;
	  }
	  return max(node.right);
   }
   
//   remove node from bst
   public void remove(int item) {
	   remove(this.root, null, false, item);
   }
   private void remove(Node node, Node parent, boolean islc, int item) {
	   if(node == null) {
		   return;
	   }
	   if(item > node.data) {
			   remove(node.right, node, false, item);
		   }
		   else if(item < node.data) {
			   remove(node.left, node, true, item);
		   }
		   else {
			   if(node.left == null && node.right == null) {
				   if(islc) {
					   parent.left = null;
				   }
				   else {
					   parent.right = null;
				   }
			   }
			   else if(node.left == null && node.right != null) {
				   if(islc) {
					   parent.left = node.right;
				   }
				   else {
					   parent.right = node.right;
				   }
			   }
			   else if(node.left != null && node.right == null) {
				   if(islc) {
					   parent.left = node.left;
				   }
				   else {
					   parent.right = node.left;
				   }
			   }
			   else {
				   if(node.left != null && node.right!= null) {
					   int max = max(node.left);
					   node.data = max;
					   
					   remove(node.left, node, true, max);
				   }
			   }
		   }
	  }
}
