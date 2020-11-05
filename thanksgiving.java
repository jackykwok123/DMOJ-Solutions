package graph;
import java.util.*;

public class thanksgiving {
	
	static HashMap <Integer, ArrayList<Integer>> map;
	
	public static void putList(int a ,int b ,int v) {
		
		if(a > v || b > v) return ;
		
		(map.get(a)).add(b); // (adjListmap.get(v)) is Integer, add(w) to the list of neighbours
		(map.get(b)).add(a); //v add w as its neighbour , w add v as its neighbour
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vertices = sc.nextInt();   //5
		int edges = sc.nextInt();    //4
		int giftshops = sc.nextInt();
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		ArrayList<Integer> gift = new ArrayList<>();
		for(int i = 0 ; i < giftshops ; i++) {
			gift.add(sc.nextInt());
		}
		
		map = new HashMap <Integer, ArrayList<Integer>>(); 
		
		for(int i= 1 ; i <= vertices ; i ++) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			map.put(i,list);
		}
		
		for(int i = 1 ; i <= edges; i++) {
			
			int source = sc.nextInt();
			int dest = sc.nextInt();
			
			putList(source,dest,vertices);
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		boolean [] visited = new boolean[vertices+1];
		Arrays.fill(visited, false);

		visited[start] = true;
		
		q.add(start);   // 1
		
		int count = 0;
		int besttoshop = 0;
		
		loop:
		while(!q.isEmpty()) {
			
			System.out.println(q);
			count++;

			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				int u = q.poll();
				ArrayList<Integer> nei = map.get(u);
				
				for(int j = 0 ; j < gift.size() ; j++) {
					if(u==gift.get(j)) {
						start = u;
						besttoshop = count;
						break loop;
					}
				}
				
				if(nei==null) continue;
			
				for(int a : nei) {
					if(!visited[a]) {
						visited[a] = true;
						q.add(a);
					}
				}		
			}
			

		}

		
		int newend = end;
		int secondstep=0;
		count =0;
		
		q = new LinkedList<>();
		visited = new boolean[vertices+1];
		Arrays.fill(visited, false);
		
		visited[start] = true;
		q.add(start); 
		
		
		loop2:
		while(!q.isEmpty()) {
			
			System.out.println(q);
			count++;
			
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				int u = q.poll();
				ArrayList<Integer> nei = map.get(u);
				
				for(int j = 0 ; j < gift.size() ; j++) {
					if(u==newend) {
						secondstep = count;
						break loop2;
					}
				}
				
				if(nei==null) continue;
			
				for(int a : nei) {
					if(!visited[a]) {
						visited[a] = true;
						q.add(a);
					}
				}		
			}
		}
		
		System.out.println((besttoshop-1)+(secondstep-1));
	}

}
