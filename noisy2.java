package graph;
import java.util.*;

public class noisy2 {
	
	static HashMap <Integer, ArrayList<Integer>> map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();   //6
		int edges = sc.nextInt();    //5
		

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
		
		System.out.println(map);
		
		Queue<Integer> q = new LinkedList<>();
		boolean [] visited = new boolean[vertices+1];
		Arrays.fill(visited, false);

		int start = 1;
		visited[start] = true;
		
		q.add(start);   // 1
		
		while(!q.isEmpty()) {
			
			
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				int u = q.poll();
				ArrayList<Integer> nei = map.get(u);
				
				if(nei==null) continue;
			
				for(int a : nei) {
					System.out.println(a);
					if(visited[a]) {
						System.out.println("N");
						return;
					}
					if(!visited[a]) {
						visited[a] = true;
						q.add(a);
					}
				}		
			}
		}
		System.out.println("Y");
		
	}


}
