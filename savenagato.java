package graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class savenagato {
	
	static HashMap <Integer, HashSet<Integer>> map;
	
	public static int BFS (int vertices ,int start) {
		
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		boolean [] visited = new boolean[vertices+1];
		Arrays.fill(visited, false);

		visited[start] = true;
		
		q.add(start);
		
		while(!q.isEmpty()) {
			System.out.println(q);
			count++;
			
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
		return count;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		map = new HashMap <Integer, HashSet<Integer>>(); 

		long n = Integer.parseInt(sc.readLine());
		
		for(int i = 0 ; i < n-1 ; i++) {
			
			String[] tokens = sc.readLine().split(" ");
			int source = Integer.parseInt(tokens[0]);
			int dest = Integer.parseInt(tokens[1]);

			
			if( !map.containsKey(source) ) map.put(source, new HashSet<Integer>() );
			map.get(source).add(dest);
			
			if( !map.containsKey(dest) ) map.put(dest, new HashSet<Integer>() );  
			map.get(dest).add(source);
		}
		
		for(int i = 1 ; i <= map.size() ; i++) {
			System.out.println(BFS(map.size(), i));
		}
		
	}

}
