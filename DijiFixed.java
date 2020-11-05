package graph;
import java.util.*;

public class DijiFixed{
	
	public static class Pair implements Comparable<Pair>{
		int node;
		int du;
		public Pair(int node, int du){
			this.node = node;
			this.du = du;
		}
        public int compareTo(Pair other) {
             if (du >= other.du) { return 1; }
             else return -1;
        }
	}

        int[] du;
        boolean[] visited;
        Map<Integer, LinkedList<Pair>> graph;

        
     public void dijstra(int s){
    	 
        	for(int i=0; i<n; i++) du[i] = 9999999;
            Arrays.set(visited, false);
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            Map<Pair> mp = new HashMap<>();
            
            for(int i=0; i<n; i++){
            	Pair temp = new Pair(i, 99999999);
            	if( i==s) temp.du = 0;
            	pq.add(temp);
            	mp.add(temp);
            }

            Pair start = new Pair(s, 0);
            while( !pq.isEmpty() ){
            	Pair temp = pq.poll();
            	int curnode = temp.node;
            	int du = temp.du;
            	LinkedList<Pair> list = graph.get(curnode);
            	for(Pair p : list){
            		int neighbor = p.node;
            		int pdu = p.du;  //weith from curnode to p
            		Pair v = mp.get(neighbor);
            		if( v.du > p.du + du ) v.du = p.du+du;
            		pq.remove(v);
            		pq.add(v);
            }

            	for(int i=0; i<n; i++){
            		if(!visited[i] && graph[k][i]>0){
                      if( du[i]>du[k]+graph[k][i]) du[i]=du[k]+graph[k][i];
            		}
            	}

            }
       }
}
