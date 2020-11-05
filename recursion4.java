import java.util.Scanner;

public class recursion4{
	
	public static String replace (String input) {
		
		if(input.length()<=0) {
			return input;
		}
		
		if(input.substring(0, 1).equals("x")) {
			return "y"+replace(input.substring(1));
		}
		
		else {
			return input.substring(0,1)+replace(input.substring(1));
		}
		
	}

	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		String input = sc.nextLine();
		
		System.out.println(replace(input));
		
		}
		
		
		
		
	}
		

		

		

	
