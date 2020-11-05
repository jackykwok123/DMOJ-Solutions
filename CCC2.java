import java.io.*;
import java.util.*;

public class CCC2 {

	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double a = 0;
		double b = 0;
		double c = 0;
		double smallest = 1999999999;
		
		long num [] = new long [n];
		
		for(int i = 0 ; i < n ; i++) {
			num[i] = sc.nextLong();
		}
		
		Arrays.sort(num);
		
		for(int i = 1 ; i < n-1 ; i++) {
			 //a = Math.abs(num[i] - (num[i]+num[i-1])/2);
			 //b = Math.abs((num[i]+num[i+1])/2-num[i]);
			 //c = a+b; 
			  c = Math.abs(   (num[i+1] - num[i-1] )/2.0 );
			 if( c < smallest ) {
				 smallest = c;
			 }
		}
		//long sm = (long)(smallest*10);
		//double small = 1.0*sm/10;
		System.out.printf("%.1f",smallest);
		
		
		}
	}

