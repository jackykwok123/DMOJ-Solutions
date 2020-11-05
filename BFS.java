package graph;
import java.util.*;

public class BFS {
	
	public static void BFS (int start) {
		count=0;
		Queue<Integer> q = new LinkedList<>();
		visited = new boolean[100];
		Arrays.fill(visited, false);
		
		visited[start] = true;
		
		q.add(start);   // 1
		
		while(!q.isEmpty()) {
			count++;
			if(count==3) {
				count=q.size()-1;
				return;
			}
			
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				int u = q.poll();
				HashSet<Integer> nei = map.get(u);
				
				if(nei==null) continue;
			
				for(int a : nei) {
					if(!visited[a]) {
						visited[a] = true;
						q.add(a);
					}
				}		
			}
		}
	}
	
	static HashMap <Integer, ArrayList<Integer>> map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();   //6
		int edges = sc.nextInt();    //5
		
		/*
		 * 6 5
		   1 2
		   1 3
           2 6
           2 5
           3 4
		 */
		
		map = new HashMap <Integer, ArrayList<Integer>>(); 
		
		for(int i= 1 ; i <= vertices ; i ++) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			map.put(i,list);       // put null arraylist to vertices
		}
		
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
		
		Queue<Integer> q = new LinkedList<>();
		boolean [] visited = new boolean[vertices+1];
		Arrays.fill(visited, false);

		int start = 1;
		visited[start] = true;
		
		q.add(start);   // 1
		
		while(!q.isEmpty()) {
			System.out.println(q);
			
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				int u = q.poll();
				ArrayList<Integer> nei = map.get(u);
				
				if(nei==null) continue;
			
				for(int a : nei) {
					if(!visited[a]) {
						visited[a] = true;
						q.add(a);
					}
				}		
			}
		}
		
		
	}

}
