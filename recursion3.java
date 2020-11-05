import java.util.Scanner;

public class recursion3{
	
	public static int power (String input) {
		
		if(input.length()==0) {
			return 0;
		}
		
		if(input.substring(0, 1).equals("x")) {
			return power(input.substring(1))+1;
		}
		
		else {
			return power(input.substring(1));
		}
		
	}

	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		String x = sc.nextLine();
		
		String input = x.toLowerCase();
		
		System.out.println(power(input));
		
		}
		
		
		
		
	}
		

		

		

	
