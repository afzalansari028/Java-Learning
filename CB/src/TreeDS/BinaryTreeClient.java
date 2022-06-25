package TreeDS;

public class BinaryTreeClient {
   //50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		  tree.display();
		  
		  System.out.println("Height of tree is "+tree.height());
		  
		  tree.preOrder();
		  tree.postOrder();
		  tree.inOrder();
		  
		  tree.levelOrder();
		  
		  System.out.println(tree.isBST());
		  
		  System.out.println("Diameter is "+tree.diameter());
		  System.out.println("Diameter is "+tree.diameterBtr());
		  
		  System.out.println("Sum of all leaf nodes is "+tree.sumLeaf());
		  
	}
	

}
