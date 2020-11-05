import java.util.*;

public class xor {
	
	public static long f(long a) { // 10
	     long res[] = {a,1,a+1,0};
	     return res[(int) (a%4)];
	}

	public static long getXor(long a, long b) {

		//System.out.println(f(b));
		//System.out.println(f(a-1));
		return f(b)^f(a-1); //10^3
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		System.out.println(2^2);
		
		for(int j = 0 ; j <= n ; j ++) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.println(getXor(a,b));
		}  

		
	}
}
