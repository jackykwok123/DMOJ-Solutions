import java.util.*;

public class tudor {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int al [] = new int [26];
		
		String a = sc.nextLine();
		for(int i = 0 ; i < a.length() ;i++) {
			char c = a.charAt(i);
			al[c-'A']++;
		}
		
		String b = sc.nextLine();
		for(int i = 0 ; i < b.length() ;i++) {
			char c = b.charAt(i);
			if(al[c-'A']>0)al[c-'A']--;
		}
		
		int count = 0;
		for(int x : al) {
			count+=x;
		}
		
		System.out.println(count);
	}

}
