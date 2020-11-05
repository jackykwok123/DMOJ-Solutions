package graph;

import java.util.*;
public class dmopc18c2p3 {
	static HashMap <Integer, ArrayList<Integer>> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int vertices = sc.nextInt();   //5
		int edges = sc.nextInt();    //4
		int giftshops = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		Map<Integer, Integer > amap = new HashMap<>();
		Map<Integer, Integer> bmap = new HashMap<>();
		
		for(int i = 0 ; i < giftshops ; i++) {
			int temp = sc.nextInt();
			amap.put(temp, 0);
			bmap.put(temp, 0);
		}

		map = new HashMap <Integer, ArrayList<Integer>>(); 
		for(int i = 1 ; i <= edges; i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			if( !map.containsKey(source) ) map.put(source, new ArrayList<Integer>() );
			map.get(source).add(dest);
			if( !map.containsKey(dest) ) map.put(dest, new ArrayList<Integer>() );
			map.get(dest).add(source);
		}
		
		Queue<Integer> q1 = new LinkedList<>();
		boolean [] visited1 = new boolean[vertices+1];
		Arrays.fill(visited1 , false);
		int start1 = start;
		visited1[start1] = true;
		q1.add(start1);
		Queue<Integer> q2 = new LinkedList<>();
		boolean [] visited2 = new boolean[vertices+1];
		Arrays.fill(visited2 , false);
		int start2 = end;
		visited2[start2] = true;
		q2.add(start2);
		int counta = 0;
		int countb = 0;
		int min = Integer.MAX_VALUE;
		
		while( !q1.isEmpty() || !q2.isEmpty() ) {   // went through all giftshops (from a to s, from b to s)
			
			if(!q1.isEmpty()) {
				System.out.println("q1" +q1);
				int size = q1.size();
				counta++;
				for(int i = 0 ; i < size ; i++) {
					int u = q1.poll();
					ArrayList<Integer> nei = map.get(u);
					if(nei==null) continue;
					for(int a : nei) { 
						if(!visited1[a]) {
							visited1[a] = true;
							if( bmap.containsKey(a) && bmap.get(a) > 0 ) {  // bmap contains a and bmap is not gift shop
								int mtemp = bmap.get(a) + counta; // steps from a to s + b to s
								if(mtemp<min) min = mtemp;
							}
							
							if( amap.containsKey(a) ) amap.put(a, counta); 
							q1.add(a);
						}
					} 
				}
	}
			if(!q2.isEmpty()) {
				System.out.println("q2" +q2);
				countb++;
				int size = q2.size();
				for(int i = 0 ; i < size ; i++) {
					int u = q2.poll();
					ArrayList<Integer> nei = map.get(u);
					if(nei==null) continue;
					for(int a : nei) {
						//System.out.print(" q2 " + a + "  ");
						if(!visited2[a]) {
							visited2[a] = true;
							if( amap.containsKey(a) && amap.get(a) > 0 ) {
								int atemp = amap.get(a) + countb;
								if( atemp < min) min = atemp;
							}
							if( bmap.containsKey(a) ) bmap.put(a, countb);
							q2.add(a);
						}
					} 
				}
			}
		}
		System.out.println(min);
	}
}