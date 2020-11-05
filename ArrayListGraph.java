package graph;
import java.util.*;

public class ArrayListGraph {
	
	static ArrayList<HashSet<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();
		int edge = sc.nextInt();
		
		for(int i = 0 ; i <= vertices; i++) {	
				graph.add(i,new HashSet<Integer>());       // put null arraylist to vertices
		}
		
		for(int i = 0 ; i < edge ; i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			
			graph.get(source).add(dest);
			graph.get(dest).add(source);
			
		}
		
		System.out.println(graph);
		
	}
	
	

	
}
