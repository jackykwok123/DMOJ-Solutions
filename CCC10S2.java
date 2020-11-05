import java.util.*;

public class CCC10S2 implements Comparable{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<String, String> map = new HashMap<>();
		
		for(int i = 0; i< n ;i++) {
			String s [] = sc.nextLine().split(" ");
			map.put(s[1], s[0]);
		}
		
		String code = sc.nextLine();
		
		String current = "";
		for(int i = 0 ; i < code.length(); i++) {
			char c = code.charAt(i);
			current+=c;
			
			if(map.containsKey(current)) {
				System.out.print(map.get(current));
				current ="";
			}
		}
		
	}
	
	public int compareTo(Object x) {
		return 0;
	}
}
