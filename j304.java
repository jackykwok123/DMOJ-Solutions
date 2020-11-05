package dmopc;
import java.util.*;

public class j304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    String[] first = new String[a];
		    String[] second = new String[b];
		    
		    for(int i = 0; i < a; i++){
		      first[i] = sc.next();
		      sc.nextLine();
		    }
		    for(int i = 0; i < b; i++){
		    second[i] = sc.next();
			sc.nextLine();
		    }
		    for(int i = 0; i < a; i++){
		      for(int j = 0; j < b; j++){
		        System.out.println(first[i] + " as " + second[j]);
		      }
		    }
	}
}
