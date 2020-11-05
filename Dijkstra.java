package graph;
import java.util.*;

public class Dijkstra {

	 /* All algorithms use the relaxation formula: d(u) -> the CURRENT shortest path from start dest node u
	 * This one is the Djikstra way
	 * outputs all nodes, 1 dest n, and their paths (from 1)
	 * d[u]<= d[v]+Wuv
	 */
	
	static class pair implements Comparable<pair>{
		int dest;                                  // destination
		int weight;								 // priority
		public pair(int dest, int weight) {			
			this.dest = dest;							
			this.weight = weight;
		}
		public int compareTo(pair other) {       //compare dest before
			if(weight>=other.weight) {      // if before > now 
				return 1;										
			}
			return -1;							 // else return -1
		}
	}
	
	
	static pair[] d;
	static HashSet<Integer> visited=new HashSet<>();
	static PriorityQueue<pair> q=new PriorityQueue<>();
	static HashMap<Integer, ArrayList<pair>> map =new HashMap<>();
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nodes=sc.nextInt();            // declare nodes 
		int edges=sc.nextInt();			   // declare edges 
		d=new pair[nodes+1]; 		   // pair includes ( dest and weight )
		
		for(int i=1;i<=nodes;i++) {
			d[i]=new pair(i,Integer.MAX_VALUE); // set all d of node as infinity for now
		}
		
		
		for(int i=1;i<=nodes;i++) {         
			map.put(i, new ArrayList<>());  // put null list indest the map 
		}
		
		
		for(int i=1;i<=edges;i++) {
			int from=sc.nextInt();       
			int dest=sc.nextInt();
			int weight=sc.nextInt();
			map.get(from).add(new pair(dest,weight));
			map.get(dest).add(new pair(from,weight));
		}
		
		
		d[1].weight=0;
		q.add(d[1]);
		
		
		while(!q.isEmpty()) {
			
			int next=q.poll().dest;  //4
			
			if(visited.contains(next)) continue;
			
			System.out.println(next+" ");
			
			visited.add(next);
			
			for(pair kids:map.get(next)) {
				// 2
				// infinity > 0 + 2 
				// set d[2] = 2
				if(visited.contains(kids)) continue;
				
				//  2 >  
				
				if(d[kids.dest].weight>d[next].weight+kids.weight) {  
					// if distance from starting node to kid.destination is bigger than shortest path from the original node + kid to dest node 
					d[kids.dest].weight=d[next].weight+kids.weight;
					q.remove(d[kids.dest]);
					q.add(d[kids.dest]);
				}	
			}
		}
		
		for(int i=1;i<=nodes;i++) {
			System.out.println("Node1 -> Node" + i + " "+ d[i].weight);    //from 1
		}
	}

}