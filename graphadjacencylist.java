package graph;
import java.util.*;

public class graphadjacencylist {

	private Map <Integer, ArrayList<Integer>> adjListmap;
	
	public graphadjacencylist(int vertices) { // initialize number of vertices 
		adjListmap = new HashMap <Integer, ArrayList<Integer>> (); 
		for(int i = 1 ; i <= vertices ; i++) {
			ArrayList<Integer> neighbours = new ArrayList<>();
			adjListmap.put(i, neighbours);
		}
	}
	
	public void addEdge (int v, int w) {  
		
		if( v > adjListmap.size() || w > adjListmap.size()) { // can not be out of the boundary
			return;
		}
		// (get the list from map). add int           
		(adjListmap.get(v)).add(w); // (adjListmap.get(v)) is Integer, add(w) to the list of neighbours
		(adjListmap.get(w)).add(v); //v add w as its neighbour , w add v as its neighbour
	}
	
	public ArrayList <Integer> getNeighbours( int v) {  // return the list 
		if( v > adjListmap.size()) {
			return null;
		}
		
		return new ArrayList<Integer>(adjListmap.get(v));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int count = 1;
		int source, dest;
		
		System.out.println("Enter Number of Vertices and edges");
		int vertices = sc.nextInt(); //point
		int edges = sc.nextInt(); // connections
		
		graphadjacencylist adjacencylist = new graphadjacencylist(vertices); 
		// create a map ( int , list) vertices are number of points and arrayList for each vertices( edges)
		
		System.out.println("Enter Edges in format source  -> destination");
		
		while(count <= edges ) {
			source = sc.nextInt();
			dest = sc.nextInt(); 
			adjacencylist.addEdge(source, dest);  // add edges to arrayLists
			count++;
		}
		
		System.out.println("given adjacency list for the graph");
		
		for(int i = 1 ; i <= vertices ;i++) {
			System.out.print(i + "->");
			ArrayList<Integer> edgeList = adjacencylist.getNeighbours(i); // return neighbours
			for(int j = 1;; j++) {  // print list 
				if(j!=edgeList.size()) System.out.print(edgeList.get(j-1)+"->");
				
				else {
					System.out.print(edgeList.get(j-1));
					break;
				}
			}
			System.out.println("");
			
		}
	}

}
