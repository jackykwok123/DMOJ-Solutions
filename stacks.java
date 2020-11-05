import java.util.*;
import java.util.Scanner;

public class stacks {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		boolean flag = true;
		Stack <String> st = new Stack<String>();
		
		while(flag){
			String text = sc.next();
			String info = sc.next();
			
			if(text.equals("push")) {
				st.push(info);
			}
			
			if(text.equals("pop")) {
				if( !text.isEmpty() ) st.pop();
				else System.out.println("EMTPY");
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

