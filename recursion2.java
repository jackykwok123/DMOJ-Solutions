import java.util.Scanner;

public class recursion2{
	
	public static double power (double n, double g) {
		
		if(Math.abs(n/g-g)<0.01) return g;
		
		double newg = ((n/g)+g)/2;
		
		return power(n,newg);
		
	}

	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println(power(2, 1.5));
		
		}
		
		
		
		
	}
		

		

		

	
