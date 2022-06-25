package CollectionFramework;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		  list.add(1);
		  list.add(2);
		  list.add(2,3);
		 
		  
		  System.out.println(list);
		  System.out.println(list.contains(3));
		  System.out.println(list.size());
		  System.out.println(list.poll());
		  System.out.println(list);
	}

}
