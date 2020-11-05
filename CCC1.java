import java.io.*;
import java.util.*;

public class CCC1 {

	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		
		long [] [] num = new long [n] [n];
		long [] [] result = new long [n] [n];
		
		int srow=0, scol=0;
		long smallest = 999999999;
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j < n;j++) {
			    num[i][j] = sc.nextLong();
			    if(num[i][j] < smallest) { srow=i; scol=j; smallest=num[i][j]; }
			}
		}
		
		
		
		
		if(srow==0&&scol==0) {   //original
			for(int i = 0 ; i < n;i++) {
				for(int j = 0 ; j < n;j++) {
				System.out.print(num[i][j]+" ");
				}
				System.out.println("");
			}
			return;
		}
		
		if(srow == n-1 && scol ==0 ) {  //left bottom
			
			int count = 0;
			
			for(int i = 0 ; i < n ; i++) {
				for(int j = n-1 ; j >= 0;j--) {
					result[i][count] = num[j][i] ;
					count++;
				}
				count = 0;
			}
			
			for(int i = 0 ; i < n;i++) {
				for(int j = 0 ; j < n;j++) {
				System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
			
			return;
			
		}
		
		if(srow==0 && scol == n-1) {
			
			int count = 0;
			for(int j = n-1 ; j >= 0 ;j--) {
				for(int i = 0 ; i < n ; i++) {
					result[count][i] = num [i][j]; 
				}
				count++;
			}
			
			for(int i = 0 ; i < n;i++) {
				for(int j = 0 ; j < n;j++) {
				System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
			return;
		}
		
		if(srow==n-1 && scol == n-1) {
			
			int count = n-1;
			int count2 = 0;
			
			  for(int j = n-1; j >= 0 ; j--) {
				for(int i = 0 ; i < n ; i++) {
					result[count2][i] = num [j][count]; 
					count--;
				}
				count = n-1;
				count2++;
			}
			  
		
			
			for(int i = 0 ; i < n;i++) {
				for(int j = 0 ; j < n;j++) {
				System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		
		  }
		}
		
		
	}

