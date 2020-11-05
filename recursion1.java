/**
 * 
 */
/**
 * @author Jacky.Kwok
 *
 */

import java.util.Scanner;

public class recursion1{

		   public static boolean solve(String p) {
			   
			   	 if(p.equals("1")||p.equals("8")) {
			   		 return true;
			   	 }
			   
			     if(p.length()==0)
		            return true; 

		         if(p.substring(0,1).equals("0")&&p.substring(0,1).equals(p.substring(p.length()-1))||p.substring(0,1).equals("1")&&p.substring(0,1).equals(p.substring(p.length()-1))||p.substring(0,1).equals("8")&&p.substring(0,1).equals(p.substring(p.length()-1))||p.substring(0,1).equals("6")&&p.substring(p.length()-1).equals("9")||p.substring(0,1).equals("9")&&p.substring(0,1).equals("9")&&p.substring(p.length()-1).equals("6")) 
		            return solve(p.substring(1,p.length()-1));

		         else return false;
			   
		   }

		   public static void main(String[] args) {
			 
		       Scanner sc = new Scanner(System.in);
		       int count = 0;
		       
		       int n = sc.nextInt();
		       
		       sc.nextLine();
		       
		       String p = sc.nextLine();
		       
		       int x = Integer.parseInt(p);
		       
		       int z = x;
		       
		       for(int i = 0; i < z; i++) {
		    	   
		    	   if(solve(p)) {
		    	   count++;
		    	   x--;
		    	   p = Integer.toString(x);
		    	   }
		    	   
		    	   else {
		    	   x--;
		    	   p = Integer.toString(x);
		    	   }
		       }   
		       
		       System.out.println(count);
		   }
		}
		
		
		

		

		

	
