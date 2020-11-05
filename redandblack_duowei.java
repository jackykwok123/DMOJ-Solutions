package graph;
import java.util.*;

public class redandblack_duowei {

	static int count;
	
	public static void DFS(int i ,int j , char matrix[][], int w, int h){ 
		
		if(i< 0 || j < 0 || i >= w || j >= h||matrix[i][j]=='#'||matrix[i][j] == 'X' ) return;
		
		matrix[i][j] = 'X';
		count++;
		
		DFS(i+1,j,matrix,w,h);
		DFS(i,j+1,matrix,w,h);
		DFS(i-1,j,matrix,w,h);
		DFS(i,j-1,matrix,w,h);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			
		int x1 = 0;
		int x2 = 0;
			
		int row = sc.nextInt();
		int col = sc.nextInt();
	
		if(row==0 && col == 0) break;
		
				
		char matrix [][] = new char [col][row];
		
		for(int i = 0 ; i < col ; i++) {
			String s = sc.next();
			for(int j = 0 ; j < row; j++) {
				matrix[i][j]= s.charAt(j);	
				if(matrix[i][j]=='@') {
					x1=i;
					x2=j;
				}
			}
		}
		
		count=0;
		
		DFS(x1,x2,matrix,col,row);
		System.out.println(count);
	
	}
  }

}
