import java.util.*;

public class SquareProblem{
	public static int findSmallest (int n) {
		String s = n +"";
		String sp[] = s.split("");
		Arrays.sort(sp);
		return Integer.parseInt(sp[0]+sp[1]+sp[2]+sp[3]);
		
	}
	
	public static int findBiggest (int n) {
		
		String s = n +"";
		String sp[] = s.split("");
		Arrays.sort(sp);
		return Integer.parseInt(sp[3]+sp[2]+sp[1]+sp[0]);
		
	}
	

	
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int a = findBiggest(n);
		
		int b = findSmallest(n);
		
		
		}

		
		
		
	}
		

	
