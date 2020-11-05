import java.util.*;

public class DP_Pow {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(pow(3,4));
		System.out.println(pow2(3,4));
	}
	
	public static int pow (int a, int b) {
		int temp = 1;
		if(b==0) return 1;
		temp = pow(a,b/2);
		if(b%2 == 0) return temp*temp;
		return a*temp*temp;
	}
	
	public static int pow2 (int a, int b) {
		int [] arr = new int [10000];
		
		arr[0] = 1;
		
		for(int i = 1 ; i<= b/2; i++) {
			arr[i]= a*arr[i-1]*arr[i-1];
		}
		return arr[b];
	}
	
}
