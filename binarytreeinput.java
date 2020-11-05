package graph;
import java.util.*;

public class binarytreeinput {
	
	static HashMap <String, ArrayList<String>> map;
	
	public static void recursion (String str) {
		
		if(str.length()<=2) return;
	
		String rightstring="";
		
		//left
		Stack left = new Stack();
		String leftstring = "";
		
		int index = 0;
		
		for(int i = 0 ; i < str.length()-1 ; i++) {
			
			index=i;
			
			leftstring+=(str.charAt(i)+"");	
			
			if(str.charAt(i)=='(') left.push('(');
			if(str.charAt(i)==')') left.pop();
			if(left.isEmpty()) break;
		}
	
		
		if(str.charAt(1)>=48 && str.charAt(1)<=57) {
			addNode(leftstring,leftstring.charAt(1)+"",leftstring.charAt(3)+"");
			leftstring=str.substring(6,str.length());
			rightstring="";
		}
		
		else {
			rightstring=str.substring(index+2, str.length()-1);
		}
		
		
		//right
		
//		if(leftstring.charAt(0)>=48&&leftstring.charAt(0)<=57) addNode(str,leftstring.charAt(0)+"",leftstring.charAt(2)+"");
//		else addNode(str,leftstring,rightstring);
//		
		
		String result = leftstring+" "+rightstring;
		
		System.out.println(result);
		
//		recursion(result);
	}
	
	
	public static void addNode(String node, String left, String right) {
		String source = node;
		
		if( !map.containsKey(source) ) map.put(source, new ArrayList<String>() );
		map.get(source).add(left);
		map.get(source).add(right);

	}
	
	
	public static void main(String[] args) {
		
		map = new HashMap<>();
		
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		
		recursion(s);
		System.out.println(map);
		
	}
	
	
}
