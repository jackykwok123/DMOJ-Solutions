package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ecoo19r2 {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, String> map = new HashMap<>();
		HashMap<Character, Integer> count = new HashMap<>();
		HashMap<Character, Integer> length = new HashMap<>();
		
		String[] tokens = sc.readLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		
		String str = tokens[2];
		

		// rules
		for(int i = 0 ; i < a ; i++) {
			String[] in = sc.readLine().split(" ");
			
			char c = in[0].charAt(0);  // character
			String s = in[1];  // replace to
			
			map.put(c, s);
			length.put(c, s.length());
		}
		
		for(int j = 0 ; j < str.length(); j++) {
			count.put(str.charAt(j), 1);
		}
		
		
		System.out.println(map);
		System.out.println(count);

			
				
	
		
	}
}
