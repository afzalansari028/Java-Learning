package Graph;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
	
		Graph graph = new Graph();
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("B", "C", 4);
		graph.addEdge("C", "D", 7);
		graph.addEdge("D", "E", 10);
		graph.addEdge("E", "F", 9);
		graph.addEdge("E", "G", 8);
		graph.addEdge("F", "G", 6);
		
		graph.display();
		
//		System.out.println(graph.numVertex());
//		System.out.println(graph.numEdges());
//		
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		
//		System.out.println(graph.containsVertex("A"));
//		System.out.println(graph.containsVertex("H"));
//		
////		graph.removeEdge("A", "B");
////		graph.display();
//		
//		graph.removeVertex("A");
//		graph.display();
	
		System.out.println(graph.hasPath("A", "F", new HashMap<>()));
		
	}

}
