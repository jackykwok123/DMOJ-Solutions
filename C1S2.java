import java.util.*;

public class C1S2 {
	
	public static boolean check (int [] arr) {
		for(int i = 0 ; i < arr.length-1; i++) {
			if(!(arr[i]<arr[i+1])) return false; 
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		int count = 0;
		
		int n = sc.nextInt();
		
		int [][] grid = new int [n][n];
		
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0; j < n ; j++) {
				grid[i][j]=sc.nextInt();
			}
			int [] arr = grid[i];
			if(!check(arr)) count++;
		}
		

		System.out.println(count);
		
	}
}
