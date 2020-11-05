import java.util.Scanner;

public class Recursionhard{
	
	public static int sum (int [] num , int n ,int a ) {
	
		if(a >= n) return 0;
		if(a == n-1) return num[n-1];
		
		int x = sum(num, n, a+1);
		int y = sum(num, n, a+2) +num[a];
		
		return Math.max(x,y);

	}

	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		
		int [] num = new int [n];
		
		for(int i = 0 ; i < n ; i ++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println(sum(num,n,0));
	}
		
}
		

		

	
