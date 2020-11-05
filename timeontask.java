import java.util.*;

public class timeontask{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int max = sc.nextInt();
		int n = sc.nextInt();
		int [] time = new int [n];
		
		for (int i = 0; i < n; i++){
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time);
		
		int count = 0;
		
		int index = 0;

		while(count + time[index] <= max){
			count+=time[index];
			index++;
		}
		System.out.println(index); 

	}
}