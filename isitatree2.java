package graph;
import java.util.*;

public class isitatree2 {
	
	static HashMap <Integer, ArrayList<Integer>> map;
	static boolean flag;
	static boolean [] checker;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		map = new HashMap <Integer, ArrayList<Integer>>(); 
		HashSet<Integer> visit = new HashSet<>();
		
		int[][] check = new int [4][4];
		
		for(int i = 0 ; i < 4; i++) {
			for(int  j = 0 ; j <4 ; j++) {
				check[i][j] = sc.nextInt();
				if(check[i][j]==1) {
					int source = i;
					int dest = j;
					
					if( !map.containsKey(source) ) map.put(source, new ArrayList<Integer>() );
					map.get(source).add(dest);
					
					if( !map.containsKey(dest) ) map.put(dest, new ArrayList<Integer>() );  
					map.get(dest).add(source);
				}
			}
		}
		
		System.out.println(map);

		
	}

}
