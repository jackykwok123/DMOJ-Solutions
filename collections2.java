import java.util.*;
import java.util.Scanner;

public class collections2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		boolean flag = true;
		Stack <String> st = new Stack<String>();
		
		while(flag){
			String text = sc.next();
			
			if(text.equals("push")) {
				String info = sc.next();
				st.push(info);
			}
			
			if(text.equals("pop")) {
				if( !st.isEmpty() ) st.pop();
				else System.out.println("EMPTY");
			}
			
			if(text.equals("END")) {
			while( !st.isEmpty() ){  
				System.out.println( st.pop() ); 
				}
			 flag = false;
			}
		}
		
		}
		
		
	}

