import java.util.Scanner;

public class C1S22 {
	
	public static boolean check (int [][] arr) {
		//horizontal
		for(int i = 0 ; i < arr.length-1; i++) {
			if(!(arr[i]<arr[i+1])) return false; 
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		int count = 0;
		
		int n = sc.nextInt();
		
		int [][] grid = new int [n][n];
		
		int hor = 0;
		//horizontal
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0; j < n ; j++) {
				grid[i][j]=sc.nextInt();
			}
			int [] arr = grid[i];
			if(!check(arr)) hor++;
		}
		
		int ver = 0;
		
		//vertical
		for(int j = 0 ; j < n-1 ; j++) {
			for(int i = 0 ; i < n; i++) {
				if(grid[j][i]>grid[j+1][i]) ver++;
			}
		}
		
		count=ver+hor;
		
		System.out.println(count);
		
	}
}
