package TreeDS;
import java.util.*;

public class GenericTree {
    private class Node {
    	int data;
    	ArrayList<Node> children;
    	 Node(int data) {
    		 this.data = data;
    		 this.children = new ArrayList<>();
    	 }
    }
    private Node root;
    private int size;
    
    GenericTree() {
    	Scanner sc = new Scanner(System.in);
    	this.root = this.takeInput(sc, null, 0);
    }
    
    private Node takeInput(Scanner sc, Node parent, int ithchild) {
    	if(parent == null) {
    		System.out.println("Enter the data for the root node");
    	}
    	else {
    		System.out.println("Enter the data for "+ithchild+"th child of "+parent.data);
    	}
    	int nodedata = sc.nextInt();
    	Node node = new Node(nodedata);
    	size++;
    	
    	System.out.println("Enter the no of children for "+node.data);
    	int children = sc.nextInt();
    	//will be executed according to the value of children
    	for(int i=0; i<children; i++) {
    		Node child = this.takeInput(sc, node, i);
    		node.children.add(child);
    	}
    	return node;
    }
    
    public void display() {
    	this.display(this.root);
    }
    private void display(Node node) {
    	String str = node.data+"=>";
    	for(int i=0; i<node.children.size(); i++) {
    		str = str + node.children.get(i).data+",";
    	}
    	str = str + "END";
    	//display the string for curent node
    	System.out.println(str);
    	//display for all nodes
    	for(int i=0;i<node.children.size();i++) {
    		this.display(node.children.get(i));
    	}
    }
}
