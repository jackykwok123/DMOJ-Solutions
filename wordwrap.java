import java.io.*;
import java.util.*;

public class wordwrap {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		for(int j = 0 ; j < 10 ; j++) {
		String output = "";
		int counter =0;
		int width = Integer.parseInt(sc.readLine());
		String[] token = sc.readLine().split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(token));
		
		for(int i = 0 ; i < list.size() ; i++) {
			String x = list.get(i);
			if(x.length()>width) {
				list.set(i, x.substring(0, width));
				list.add(i+1,x.substring(width));
			}
		}
		
		while(counter<list.size()) {
			
			String s = list.get(counter);
			
			if(output.length()+s.length()>width) {
			   System.out.println(output);
			   output="";
			}
			
			output+=s+" "; //LOVE 
			counter++;//3
		}
		
		System.out.println(output);
		System.out.println("=====");
		
		} 
	}
}
