package graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Robotheives {
	static Character[][] matrix;
	static int height;
	static int width;
	
	public static class pair {
		int i;
		int j;
		
		public pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
	
	public static void Locations(pair p) {
		
		int i = p.i;
		int j = p.j;
		
		
		//up
		for(int k = i-1 ; k >= 0 ; k-- ) {
			
			if(matrix[k][j]=='U'||matrix[k][j]=='D'||matrix[k][j]=='L'||matrix[k][j]=='R') {
				continue;
			}
			
			if(matrix[k][j]=='W'|| matrix[k][j]=='X') break;
			else matrix[k][j]='X';
		}
		
		//down
		for(int k = i+1; k < height ; k++) {
			
			if(matrix[k][j]=='U'||matrix[k][j]=='D'||matrix[k][j]=='L'||matrix[k][j]=='R') {
				continue;
			}
			
			if(matrix[k][j]=='W'|| matrix[k][j]=='X') break;
			else matrix[k][j]='X';
		}
		
		//left
		
		for(int x = j-1; x >=0 ; x--) {
			
			if(matrix[i][x]=='U'||matrix[i][x]=='D'||matrix[i][x]=='L'||matrix[i][x]=='R') {
				continue;
			}
			
			if(matrix[i][x]=='W' || matrix[i][x]=='X') break;
			else matrix[i][x]='X';
		}
		
		//right
		
		for(int x = j+1; x < width ;x++) {
			
			if(matrix[i][x]=='U'||matrix[i][x]=='D'||matrix[i][x]=='L'||matrix[i][x]=='R') {
				continue;
			}
			
			if(matrix[i][x]=='W' || matrix[i][x]=='X') break;
			else matrix[i][x]='X';
		}
	}
	
	
	public static pair check (pair u) {
		int i = u.i;
		int j = u.j;
		
		if(inside(u)) {
		if(matrix[i][j]=='U') return new pair (i-1,j);
		else if(matrix[i][j]=='D') return new pair (i+1,j);
		else if(matrix[i][j]=='L') return new pair (i,j-1);
		else if(matrix[i][j]=='R') return new pair (i,j+1);
		else if(!(matrix[i][j]=='X')) return u;
		}
		
		return null;
	}
	
	public static boolean inside (pair u) {
		int i = u.i;
		int j = u.j;
		
		if(i>=0&&i<height&&j>=0&&j<width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ArrayList<pair> getKids(pair u) {
		ArrayList<pair> kids = new ArrayList<>();
		
		int i = u.i;
		int j = u.j;
		
		//up
		pair up = check(new pair (i-1,j));
		if(up!=null&&inside(up)) kids.add(up);
		
		//down
		pair down = check(new pair (i+1,j));
		if(down!=null&&inside(down))  kids.add(down);
		
		//left
		pair left = check(new pair (i,j-1));
		if(left!=null&&inside(left))  kids.add(left);
		
		//right
		pair right = check(new pair (i,j+1));
		if(right!=null&&inside(right)) kids.add(right);
		
		return kids;
	}
	
	
	public static int BFS (pair start, pair end) {
		
		Queue<pair> q = new LinkedList<>();
		
		HashSet<String> visited = new HashSet<>();
		
		visited.add(Integer.toString(start.i)+Integer.toString(start.j));
		
		int count = 0;
		q.add(start);   // 1
		
		
		while(!q.isEmpty()) {
			count++;
			int size = q.size();
			
			for(int i = 0 ; i < size ; i++) {
				pair u = q.poll();
				ArrayList<pair> nei = getKids(u);
				
				if(nei==null) continue;
			
				for(pair a : nei) {
					if(!visited.contains(Integer.toString(a.i)+Integer.toString(a.j))) {
						if(a.i==end.i && a.j==end.j) return count;
						visited.add(Integer.toString(a.i)+Integer.toString(a.j));
						q.add(a);
					}
					
				}		
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tokens = sc.readLine().split(" ");
		height = Integer.parseInt(tokens[0]);
		width = Integer.parseInt(tokens[1]);
		
		matrix = new Character [height][width];
		pair start = new pair (0,0);
		
		ArrayList<pair> point = new ArrayList<>();
		ArrayList<pair> camera = new ArrayList<>();
		
		for(int i = 0 ; i < height ; i++) {
			String s = sc.readLine();
			for(int j = 0 ; j < width; j++) {
				matrix[i][j]= s.charAt(j);
				if(matrix[i][j]=='S') {
					start = new pair (i,j);
				}
				
				if(matrix[i][j]=='.') {
					pair p = new pair (i,j);
					point.add(p);
				}
				
				if(matrix[i][j]=='W') {
					matrix[i][j]='X';
				}
				
				if(matrix[i][j]=='C') {
					pair p = new pair (i,j);
					camera.add(p);
				}
			}
		}
		
		sc.close();
		
		boolean cam = false;

		for(pair p: camera) {
			
			if(p.i-1==start.i && p.j==start.j) {
				cam= true;
			}
			
			if(p.i+1==start.i && p.j==start.j) {
				cam= true;
			}
			if(p.i==start.i && p.j-1==start.j) {
				cam= true;
			}
			if(p.i==start.i && p.j+1==start.j) {
				cam= true;
			}
			
			Locations(p);
			matrix[p.i][p.j]='X';
		}

		
		for(pair u :point) {
			
			if(cam) System.out.println(-1);
			else {
			if(matrix[u.i][u.j]=='X') System.out.println(-1);
			else System.out.println(BFS(start,u));
			}
			
		}
		
		
}

}
