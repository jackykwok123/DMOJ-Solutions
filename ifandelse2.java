import java.util.*;
public class ifandelse2{
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
		
		
		if( a > num3){
			System.out.println("These three numbers are able to make up a triangle");
			
		}	else if(b > num1){
			System.out.println("These three numbers are able to make up a triangle");
			
		}	else if(c > num2) {
					System.out.println("These three numbers are able to make up a triangle");
					
		}	else if(c < num2) {
					System.out.println("can not make a triangle");
				
		}   else if(a < num3) {
		          	System.out.println("can not make a triangle");
		          	
		}	else if(b < num1){
			System.out.println("can not make a triangle");
	}
	}				
}