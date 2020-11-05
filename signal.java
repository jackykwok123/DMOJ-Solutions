package graph;
import java.util.*;

public class signal {
	
	static HashSet<pair> set;
	static HashMap<pair,ArrayList<pair>> light;
	
	
	public static class pair {
		int x;
		int y;
		int r;
		
		pair(int x, int y ,int r){
			this.x=x;
			this.y=y;
			this.r=r;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int beacons = sc.nextInt();
		int queries = sc.nextInt();
		
		HashMap<Integer,pair> map = new HashMap<>();
		
		for(int i = 1 ; i <= beacons ;i++) {
			map.put(i, new pair(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		
		light = new HashMap<pair,ArrayList<pair>>();
	
		for(int i = 1 ; i <= beacons ; i++) {
			for(int j = 1 ; j <= beacons ; j++) {
				int from = i;
				int to = j;
				
				pair source = map.get(from);
				
				int x0 = map.get(from).x;
				int y0 = map.get(from).y;
				int r0 = map.get(from).r;
				
				pair dest = map.get(to);
				
				int x1 = map.get(to).x;
				int y1 = map.get(to).y;
				
				double dis = Math.sqrt( (x1-x0)* (x1-x0) + (y1-y0) * (y1-y0));
				
				if(dis==r0||dis<r0) {
					
					if( !light.containsKey(source) ) light.put(source, new ArrayList<pair>());
					light.get(source).add(dest);
				}
			}
		}
		
		
		for(int i = 0 ; i < queries ; i++) {
			set = new HashSet<>();
			
			int in = sc.nextInt();
			int dest = sc.nextInt();
			pair check = map.get(dest);
			
			pair u = map.get(in);
			
			BFS(u,check);
			
			if(set.contains(check)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}
	
	
	public static void BFS (pair d,pair check) {
		Queue<pair> q = new LinkedList<>();

		pair start = d;
		set.add(start);
		
		q.add(start);   // 1
		
		while(!q.isEmpty()) {
			
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				pair u = q.poll();
				ArrayList<pair> nei = light.get(u);
				
				if(nei==null) continue;
			
				for(pair a : nei) {
					if(a==check) {set.add(a);return;}
					if(!set.contains(a)) {
						set.add(a);
						q.add(a);
					}
				}		
			}
		}
	}
	
	
		public static void DFS (pair u ) {
		
			set.add(u);	
//		
//			System.out.println(u.x+" "+u.y);
		
			ArrayList<pair> kids = light.get(u);
		
			if(kids == null) return;
		
			for(pair a : kids) {
				if(!set.contains(a)) DFS(a);
			}
		
	}

}
