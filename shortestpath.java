package graph;
import java.util.*;

public class shortestpath {
	
	static HashMap <Integer, ArrayList<Integer>> map;
	
	public static void putList(int a ,int b ,int v) {
		
		if(a > v || b > v) return ;
		
		(map.get(a)).add(b); // (adjListmap.get(v)) is Integer, add(w) to the list of neighbours
		(map.get(b)).add(a); //v add w as its neighbour , w add v as its neighbour
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		map = new HashMap <Integer, ArrayList<Integer>>(); 
		
		for(int i= 0 ; i < vertices ; i ++) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			map.put(i,list);
		}
		
		for(int i = 0 ; i < edges; i++) {
			
			int source = sc.nextInt();
			int dest = sc.nextInt();
			
			putList(source,dest,vertices);
			
		}
		
		System.out.println(map);

	}

}
