import java.util.*;
public class numberfour{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		
		int[]num = new int [6];
		int max = num[0];
		int min = 999999999;
		
		int max2 = num[0];
		int min2 = 999999999;
		
		num[0]=sc.nextInt();
		num[1]=sc.nextInt();
		num[2]=sc.nextInt();
		num[3]=sc.nextInt();
		num[4]=sc.nextInt();
		num[5]=sc.nextInt();
	
		for(int i = 0 ; i < 3; i++) {
			if(num[i]>max) {
				max = num[i];
			}
			
			if(num[i]<min) {
				min = num[i];
			}
		}
		
		for(int i = 3 ; i < 6; i++) {
			if(num[i]>max2) {
				max2 = num[i];
			}
			
			if(num[i]<min2) {
				min2 = num[i];
			}
		}
	
		if(max2>max||min2>min) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		
		
		}
}
