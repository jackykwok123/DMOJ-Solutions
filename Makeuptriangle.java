import java.util.Scanner;
public class Makeuptriangle{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type in first number");
		int num1 = sc.nextInt();
	
		System.out.println("type in second number");
		int num2 = sc.nextInt();
		
		System.out.println("type in third number");
		int num3 = sc.nextInt();
		
		int a = num1 + num2;
		int b = num2 + num3;
		int c = num1 + num3;
		int d = 0;
		
		if( a > num3 ) {
			d++;
		}
		if ( b> num1 ) {
			d++;
		}
		if ( c > num2 ) {
			d++;
		}
		
		if( d == 3) {
			System.out.println("can make up triangle");
		}
		else {
			System.out.println("can not make up triangle");
		}
	}				
}