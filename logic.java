import java.util.*;

public class logic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type in first number");
		int num1 = sc.nextInt();
	
		System.out.println("type in second number");
		int num2 = sc.nextInt();
		
		System.out.println("type in third number");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3 ) {
			System.out.println("the max value is " +num1);
		}
		
		if (num2 > num3 && num2 > num1) {
			System.out.println("the max value is " + num2);
		}
		
		if (num3 > num1 && num3 > num2) {
			System.out.println("the max value is " + num3);
		}
		if (num1 < num2 && num1 < num3 ) {
			System.out.println("the min value is " +num1);
		}
		
		if (num2 < num3 && num2 < num1) {
			System.out.println("the min value is " + num2);
		}
		
		if (num3 < num1 && num3 > num2) {
			System.out.println("the min value is " + num3);
		}
		
		
	}
}