package graph;
import java.util.*;

public class rewritebfs {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
	
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		
		for(int i = 1 ; i <= vertices ; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		
		for(int i = 0 ; i < edges ; i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			
			if(!map.containsKey(source)) map.put(source, new ArrayList<Integer>());
			map.get(source).add(dest);
			
			if(!map.containsKey(dest)) map.put(dest, new ArrayList<Integer>());
			map.get(dest).add(source);	
		}
		
		boolean[] visited = new boolean [vertices+1];
		Arrays.fill(visited,false);
		int start = 1;
		
		Queue<Integer> q = new LinkedList<Integer>();
		visited[start]=true;
		q.add(start);
		
		
		while(!q.isEmpty()) {
			System.out.println(q);
			
			for(int i = 0 ; i < q.size() ; i++) {
				ArrayList<Integer> nei = map.get(q.poll());
				if(nei==null) continue;
				
				for(int a : nei) {
					if(!visited[a]) {
						visited[a]=true;
						q.add(a);
					}
				}
	
			}
		}	
	}
}
