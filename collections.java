import java.util.*;
import java.util.Scanner;

public class collections {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int count=0; count<n; count++){
			String str = sc.next();
			if( str.equals( "add" ) ){
				int value = sc.nextInt();
				list1.add( value );
			}
			
			if( str.equals( "insert" ) ){
				int index = sc.nextInt();
				int value = sc.nextInt();
				list1.add(index, value);
			}
			
			if( str.equals( "delete" ) ){
				int value = sc.nextInt();
				list1.remove(0);
			}
			
			if( str.equals( "get" ) ){
				int value = sc.nextInt();
				System.out.println(list1.get(value));
			}
			
			
			if( str.equals( "output") ){
				for(int i = 0; i < list1.size() ; i++) {
					System.out.print(list1.get(i) +" ");
				}
			}


		}
		
		
	}
}
