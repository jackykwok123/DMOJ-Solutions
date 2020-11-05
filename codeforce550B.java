import java.util.*;

public class codeforce550B {
	static int sum;
	static int mintotal;
	static int maxtotal;
	static int easyhardgap;
	
	
	public static void subsets(int set[]) 
	    { 
	        int n = set.length;
	        String s ="";

	        for (int i = 0; i < (1<<n); i++) 
	        { 
	            for (int j = 0; j < n; j++) {
	            	  if ((i & (1 << j)) > 0) s+=set[j]+" "; 
	            }
	            if(s.length()>=2) {
	            	//System.out.println(s);
	            	if(check(s)) {sum++; }//System.out.println(s);}
	            }
	            s="";
	        } 
	}
	
	public static boolean check (String s) {
		
		String arr []= s.split(" ");
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		int totaldiff = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			int diff = Integer.parseInt(arr[i]);
			
			if(min>diff) min = diff;
			if(diff>max) max = diff;
			totaldiff+=diff;
		}
		
		//System.out.println("gap: " +(max-min));
		//System.out.println("totaldiff: "+ totaldiff);
		
		if(totaldiff>maxtotal) return false;
		if(totaldiff<mintotal) return false;
		
		//System.out.println("here");
		
		if((max-min)<easyhardgap) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int prob = sc.nextInt();
		
		int [] set = new int [prob];
				
		mintotal = sc.nextInt();
		maxtotal = sc.nextInt();
		easyhardgap = sc.nextInt();
		
		for(int i = 0 ; i < prob ; i++) {
			set[i]=sc.nextInt();
		}
		
		subsets(set);
		System.out.println(sum);
		
		//System.out.println(check("123"));
	
	}

}
