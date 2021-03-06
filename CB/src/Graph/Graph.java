package Graph;
import java.util.ArrayList;
import java.util.HashMap;
public class Graph {
	
	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vtces;
	
	public Graph() {
		vtces = new HashMap<>();
	}
	
	public int numVertex() {
	  return this.vtces.size();	
	}
	
	public boolean containsVertex(String vname) {
	 return this.vtces.containsKey(vname);	
	}
	
	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		 vtces.put(vname, vtx);		
	}
	
	public void removeVertex(String vname) {
	 Vertex vtx = vtces.get(vname);
	 ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
	 
	 for(String key : keys) {
		 
		 Vertex nbrVtx = vtces.get(key);
		 nbrVtx.nbrs.remove(vname);
	 }
	 vtces.remove(vname);
	}
	
	public int numEdge() {
	  int count = 0;
	  ArrayList<String> keys = new ArrayList<>(vtces.keySet());
	    for(String key : keys) {
	    	Vertex vtx = vtces.get(key);
	    	count = count + vtx.nbrs.size();
	    }
	    return count/2;
	}
	
	public boolean containsEdge(String vname1, String vname2) {
	  
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}
	
	public void addEdge(String vname1, String vname2, int cost) {
		
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.put(vname2, cost); // 2k nbrs put C with a given cost
		vtx2.nbrs.put(vname1, cost); // 4k nbrs put A with a given cost
	}
	
	public void removeEdge(String vname1, String vname2) {
	
		Vertex vtx1 = vtces.get(vname1); //2k
		Vertex vtx2 = vtces.get(vname2); //4k
		
		if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.remove(vname2); // 2k nbrs remove C
		vtx2.nbrs.remove(vname1); // 4k nbrs remove A
	}
	
	public void display(){
	 
	  ArrayList<String> keys = new ArrayList<>(vtces.keySet());
	  System.out.println("----------------------------");
	  
	  for(String key : keys) {
		 
		  Vertex vtx = vtces.get(key);
		 System.out.println(key+" : "+vtx.nbrs); 
	  }
	  System.out.println("----------------------------");
	}
	
	public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed) {
		
		processed.put(vname1, true);
		if(containsEdge(vname1, vname2)) {
			return true;
		}
		
//		devote the work to nghbrs
		Vertex vtx = vtces.get(vname1);
	  ArrayList<String>	nbrs = new ArrayList<>(vtx.nbrs.keySet());
	  
	  for(String nbr : nbrs) {
		  if(!processed.containsKey(nbr) && hasPath(nbr, vname2, processed)) {
			  return true;
		  }
	  }
	  return false;
	}
	
}
