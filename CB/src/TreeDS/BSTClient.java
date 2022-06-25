package TreeDS;

public class BSTClient {

	public static void main(String[] args) {
		int in[] = {10,20,30,40,50,60,70};   //inorder
		
		BST bst = new BST(in);
		 bst.display();
		 
		 System.out.println(bst.find(10));
		 bst.add(55);
		 bst.display();
		 
//		 System.out.println(bst.max());
		 System.out.println("----------------");
		 bst.remove(55);
		 bst.display();
		
	}

}
