import java.util.*;

public class lightonoff {
	
	public static void press(int light,String[]grid,int i) {
		for(int j = 0 ; j < light ; j++) {
			if(grid[i].charAt(j)==grid[i+1].charAt(j)) grid[i+1]=grid[i+1].substring(0, j)+'0'+grid[i+1].substring(j+1);
			else grid[i]=grid[i+1].substring(0, j)+'1'+grid[i+1].substring(j+1);
		}
	}
	
	public static boolean changed (String [] grid, String [] ori) {
		for(int i = 0 ; i < grid.length ; i++) {
			if(!grid[i].equals(ori[i])) return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt();
		int light = sc.nextInt();
		sc.nextLine();
		
		String [] grid = new String [row];
		String [] ori = new String [row];
		
		for(int i = 0; i < row ; i++) { 
			String s =sc.nextLine().replaceAll(" ", "");
			grid[i]=s;
			ori[i]=s;
		}
		int count =0;
		
		for(int j = 1 ; j <= row-1 ; j++) {
			for(int i = 0; i < (row-1)/j ;i++) {
				for(int k = j*i ; k< j*i+j ; k++) {
					
			}
		}	
		}		
		for(int i = 0 ; i < j; i ++) {
			press(light,grid,i);
			if(changed(grid,ori))count++;
			grid=ori.clone();
		}
		}
	}

}
