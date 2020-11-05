package graph;
import java.util.*;

public class isitatree {
	
	static HashMap <Integer, HashSet<Integer>> map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		map = new HashMap <Integer, HashSet<Integer>>(); 

		int count = 0;
		
		int[][] check = new int [4][4];
		
		for(int i = 0 ; i < 4; i++) {
			for(int  j = 0 ; j <4 ; j++) {
				check[i][j] = sc.nextInt();
				if(check[i][j]==1) {
					int source = i;
					int dest = j;
					
					if( !map.containsKey(source) ) map.put(source, new HashSet<Integer>() );
					map.get(source).add(dest);
					
					if( !map.containsKey(dest) ) map.put(dest, new HashSet<Integer>() );  
					map.get(dest).add(source);
					count++;
				}
			}
		}
		
		int node = map.size();
		int edges = count/2;
	
		if(node==edges+1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
