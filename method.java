import java.util.*;

public class method{
	public static int addup (int a, int b, int[] num ) {
		int add = 0;
		
		for(int i = a ; i <= b;i++) {
			add += num[i];
		}

		return add;
	}
	
	public static int max (int a, int b, int[] num) {
		
		int max = 0;
		for(int i = a; i<=b;i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		
		return max;
	}
	
	public static int min (int a, int b, int[] num) {
		
		int min = 100000;
		
		for(int i = a ; i <=b;i++) {
			if(min>num[i]) {
				min = num[i];
			}
		}
		
		return min;
	}
	
	
	public static double avg (int a, int b , int[]num) {
		double avg = 0;
		
		for(int i = a;i<=b;i++) {
			avg +=num[i];
		}
		
		double x = avg/(b-a+1);
		
		return x;
	}
	
	public static int dif (int a, int b,int num[]) {
	
		int max = 0;
		int min = 10000000;
		
		for(int i=a;i<=b;i++) {
			if(min>num[i]) {
				min = num[i];
			}
		}
		
		for(int i = a ; i <= b ; i++) {
			if(num[i]>max) {
				max = num [i];
			}
		}
		
		return max-min;
		
	}
	
	
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int[] num = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			num[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
        sc.nextLine();
        
		for(int i = 0 ; i < q ; i++) {
			
			String s = sc.nextLine();			
			s= s.toUpperCase();
			//System.out.println(s);
			String sp[] = s.split(" ");
		
			String check = sp[0];
			
			int a = Integer.parseInt(sp[1]);
			
			int b = Integer.parseInt(sp[2]);
			
			if(check.equals("ADD")) {
			System.out.println(addup(a,b,num));
			}
			
			if(check.equals("MAX")) {
				System.out.println(max(a,b,num));
				}
			
			if(check.equals("MIN")) {
				System.out.println(min(a,b,num));
				}
			
			if(check.equals("AVG")) {
				System.out.println(avg(a,b,num));
				}
			 
			if(check.equals("DIF")) {
				System.out.println(dif(a,b,num));
				}
			
		}

		
		
		
	}
		
		
	}
	
