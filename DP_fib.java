import java.util.*;

public class DP_fib {
	
	static HashMap<Integer,Integer> map;  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		map =  new HashMap<>();
		System.out.println(fib(9));
		System.out.println(fib2(9));
		
	}
	
	public static int fib2 (int n) {
		int [] arr = new int [1000];
		
		arr[0]=1;
		arr[1]=1;
		
		for(int i =2 ; i<= n ; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	
	public static int fib (int n) {
		if(map.containsKey(n)) return map.get(n);
		if(n<=1) return 1;
		
		int k = fib(n-2);
		map.put(n-2, k);
		 
		int u = fib(n-1);
		map.put(n-1, u);
		
		map.put(n, u+k);
		return k+u;
	}
}
