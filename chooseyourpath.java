package graph;
import java.util.*;

public class chooseyourpath {
	
	static HashMap <Integer, HashSet<Integer>> map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();   //3
		
		map = new HashMap <Integer, HashSet<Integer>>(); 
		ArrayList<Integer> end = new ArrayList<>();
		int best = 0;
	
		
		for(int i= 1 ; i <= vertices ; i ++) {
			
			HashSet<Integer> list = new HashSet<Integer>();
			
			int n = sc.nextInt();
			if(n==0) end.add(i);
			
			for(int j = 0; j < n ;j++) {
				
				int v = sc.nextInt();
				if(v!=0)list.add(v);
				
			}
			
			map.put(i,list);
			
		}
		
		

		Queue<Integer> q = new LinkedList<>();
		boolean [] visited = new boolean[vertices+1];
		Arrays.fill(visited, false);

		int start = 1;
		visited[0] = true;
		visited[start] = true;
		
		q.add(start);   // 1
		int count = 0 ;
		
		while(!q.isEmpty()) {
			
			count++;
			
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				int u = q.poll();
				HashSet<Integer> nei = map.get(u);
				
				if(nei==null) continue;
				
				
				for(int j = 0 ; j < end.size() ; j++) {
					if(u==end.get(j)&&best==0) best = count;
				}
				
				for(int a : nei) {
					if(!visited[a]) {
						visited[a] = true;
						q.add(a);
					}
				}		
			}
		}
		
		boolean flag = true;
		
		for(boolean x: visited) {
			if(!x) flag =false;
		}
		
		if(flag) {
			System.out.println("Y");
			System.out.println(best);
		}
		else {
			System.out.println("N");
			System.out.println(best);
		}
	
		
		
	}

}
