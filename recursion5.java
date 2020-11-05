/**
 * 
 */

/**
 * @author Jacky.Kwok
 *
 */
import java.util.Scanner;

public class recursion5{
	
	public static String pairStar (String str) {
		
			if(str.length()<=1) {
				return str;
			}
			
			if(str.substring(0, 1).equals(str.substring(1,2)) {
				return pairStar(str.substring(0,1))+"*"+pairStar(str.substring(1));
			}
			
			else {
				return str.substring(0,1)+pairStar(str.substring(1));
			
	}

		
	}

	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		String str = sc.nextLine();
		
		System.out.println(replace(input));
		
		}
		
		
		
		
	}
		

		

		

	
