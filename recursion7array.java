/**
 * 
 */

/**
 * @author Jacky.Kwok
 *
 */
import java.util.Scanner;

public class recursion7array{


		   public static boolean solve(String p) {
			   
			   p.toUpperCase();
			   
			   if(p.length()==0||p.length()==1)
		         
		            return true; 

		         if(p.substring(0,1).equals(p.substring(p.length()-1))) 
		            return solve(p.substring(1, p.length()-1));


		         else return false;
			   
		   }

		   public static void main(String[] args) {
			 
		       Scanner sc = new Scanner(System.in);
		       String p = sc.nextLine();
		       
		       System.out.println(solve(p));
		   }
		}
		
		
		

		

		

	
