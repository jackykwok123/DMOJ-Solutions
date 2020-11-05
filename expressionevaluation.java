import java.util.Scanner;
import java.util.Stack;

public class expressionevaluation {
	
	public static int prec (char c) {
		
		switch (c) {
		
		case '+' : return 1;
		case '-' : return 1;
		case '*' : return 2;
		case '/' : return 2;
		
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		while(true) {
		
		String s = sc.nextLine().replaceAll("\\s","");
		
		if(s.equals("0")) break;
		
		String re = "";
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0 ; i < s.length();i++) {   
			
												//
												//re: 312*
			
			char c = s.charAt(i);
			
			if(Character.isDigit(c)) {
				re+=c;
			}
			
			else if( c == '(') {
				st.push(c);
			}
			
			else if ( c == ')') {
				
				while( st.peek() != '(') {
					re+= st.pop();
				}
				
				if (st.peek() == '(') st.pop(); 
			}
			
			
			
			else {
				while (!st.isEmpty() && prec(st.peek()) >= prec(c)) { //precedence 
	                re += st.pop();
				}
				st.push(c); // other operators	
			}
		}
		
		while (!st.isEmpty()) re += st.pop();
		
		for(int i = 0 ; i < re.length() ; i++) {
			System.out.print(re.charAt(i)+" ");
		}
		System.out.println("");
		
		}
	}

}
