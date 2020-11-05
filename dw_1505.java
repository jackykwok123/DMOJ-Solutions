import java.util.*;

public class dw_1505 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int ans = sc.nextInt();
		int count =0;
	
		for(int i = 0 ; i < n ; i ++) {
			int num = sc.nextInt();
			while(num-9>=0) {
				num=num%9;
			}
			if(num==ans) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
