import java.util.*;

public class CCC4 {
	static int n ;
	static int [][] count;
	static boolean[] check;
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
			 n = sc.nextInt();
		     count = new int [n+1][];
			 check = new boolean[n+1];
			 check[1]=true;
			for(int i = 1 ; i <= n;i++) {
				
				int x = sc.nextInt();
				if(x==0) continue;
				
				count[i] = new int[x];
				
				for(int k=0; k<x; k++) {
					count[i][k]=sc.nextInt();
					
					}
				}
			   int s = shortest(1);
			   int sp = findMin();
			   for(int k=1; k<=n; k++) {
				   if( !check[k] ) {
					   System.out.println("N");
					   System.out.println(sp);
					   return;
				   }
			   }
			   System.out.println("Y");
			   System.out.println(sp);
			
				
	}
			
	
	public static int shortest(int k) {
		if( count[k] == null) return 1;
		int min = 999999;
		for(int m=0; m<count[k].length; m++) {
			int v = count[k][m];
			if(check[v]) continue;
			check[v] = true;
		    int x = shortest(v)+1; 
			if(x<min) min = x;
		}
		
		return min;
	}
	
	public static int findMin() {
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(1);
		int cou = 0;
		boolean[] ch = new boolean[n+1];
		Arrays.fill(ch, false);
		ch[1]=true;
		while(!qu.isEmpty()) {
			int size = qu.size();
			cou++;
			for(int v = 0; v<size; v++) {
				int y = qu.poll();
				if( count[y] == null ) return cou;
				for(int t : count[y]) {
				     if(!ch[t]) qu.offer(t);
				     ch[t]= true;
				}
			}
		}
		return cou;
	}
}

