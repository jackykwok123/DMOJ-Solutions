package graph;
import java.util.*;

public class eightqueen2 {
	
	static int [] board = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}; // column 
	static boolean found = false;
	static int n;
	static int count = 0;
	
	public static void dfs(int row) {
		
		if(row>=n) {    // end
			count++;	 
			return;
		}
		
		for(int col = 0 ; col < n ; col++) {  //  right 
			         
			boolean valid = true;
			
			board[row]=col; 
			
			for(int k = 0 ; k < row ;k++) {  // duplicate horizontal ? 
				if(board[k]==col) {
					valid = false;    
					break;
				}
			}
			
			for(int v = row -1 ,d=1 ; v >=0 ; v--, d++) {    // duplicate diagonal?
				if(board[v] == col -d || board [v] == col+d) {
					valid = false;
					break;
				}
			}
			
			if(valid) dfs(row+1);  // down
			else board[row]=-1;     // reset
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		n = new Scanner (System.in).nextInt();
		dfs(0);
		System.out.println(count);
	}

}
