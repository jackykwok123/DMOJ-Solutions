import java.util.*;

public class Parking {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] cost = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		
		int start1 = sc.nextInt();
		int arrive1 = sc.nextInt();
		
		int start2 = sc.nextInt();
		int arrive2 = sc.nextInt();
		
		int start3 = sc.nextInt();
		int arrive3 = sc.nextInt();
		
		int min = Math.min(start1, Math.min(start2, start3));
		int max = Math.max(arrive3, Math.max(arrive1, arrive2));

		
		int sum =0;
		
		for(int i = min; i< max ;i++) {
			int truck = 0;
			if(i>=start1 && i<arrive1) truck++;
			if(i>=start2 && i<arrive2) truck++;
			if(i>=start3 && i<arrive3) truck++;
			sum+=truck*cost[truck-1];
		}
		System.out.println(sum);
		
		
	}
}
