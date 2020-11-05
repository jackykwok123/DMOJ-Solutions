import java.util.*;
public class viliage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int [] pos = new int [n];
		
		double [] diff = new double [n-1];
		
		for(int i = 0 ; i < n ; i++) {
			pos[i]=sc.nextInt();
		}
		
		Arrays.sort(pos);
		
		for(int i = 0 ; i < n-1 ; i++) {
			diff[i]=(double)(pos[i+1]-pos[i])/2;
		}
		
		double smallest = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < diff.length-1 ; i++) {
			double num = diff[i]+diff[i+1];
			if(smallest>num) {
				smallest = num;
			}
		}
		System.out.printf("%.1f",smallest);
		
	}

}
