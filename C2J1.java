import java.util.*;

public class C2J1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int count = 0;
		for(int i = 0 ; i < 5 ; i++) if(sc.nextLine().equals("P")) count++;
		System.out.println(count);
	}

}
