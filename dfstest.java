package graph;
import java.util.*;

public class dfstest {
	
	static HashMap <Integer, ArrayList<Integer>> map;
	static boolean [] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();   //6
		int edges = sc.nextInt();    //5
		visit = new boolean [vertices+1];
	
		
		map = new HashMap <Integer, ArrayList<Integer>>(); 
		
		//for(int i= 1 ; i <= vertices ; i ++) {
			
		//	ArrayList<Integer> list = new ArrayList<Integer>();
			
		//	map.put(i,list);       // put null arraylist to vertices
		//}
		
		for(int i = 1 ; i <= edges; i++) {   // add source to destination
			int source = sc.nextInt();
			int dest = sc.nextInt();
			
			//  it has key corresponding ?
			if( !map.containsKey(source) ) map.put(source, new ArrayList<Integer>() );
			map.get(source).add(dest);
			
			//  it has key corresponding ?
			if( !map.containsKey(dest) ) map.put(dest, new ArrayList<Integer>() );  
			map.get(dest).add(source);
		}
		
		for(int i = 1 ; i <= vertices ; i++) {
			if(!visit[i]) DFS(i); 
		}
		
	}
	

	public static void DFS (int u ) {
		
		visit[u] = true;	
		
		System.out.print(u+" ");
		
		ArrayList<Integer> kids = map.get(u);
		
		if(kids == null) return;
		
		for(int a : kids) {
			if(!visit[a]) DFS(a);
		}
	}

}
