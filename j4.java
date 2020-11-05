import java.util.*;

public class Main{
  public static void main(String[] args){
    boolean magic = true;
    Scanner in = new Scanner(System.in);
    int[][] square = new int[4][4];
    int[] row = new int[4];
    int[] column = new int[4];
    for(int i = 0 ; i < 4; i++){
      for(int j = 0; j < 4; j++){
        square[i][j] = in.nextInt();
        row[i]+=square[i][j];
      }
    }
    for(int j = 0 ; j < 4; j++){
      for(int i = 0; i < 4; i++){
        column[j]+=square[i][j];
      }
    }
    if((allEqual(row))&&(allEqual(column))&&(row[0] == column[0])){
      System.out.println("magic");
    }else System.out.println("not magic");
    
    
    
  }
  public static boolean allEqual(int[] myArray){
    int sum  = myArray[0];
    for(int i = 0; i < myArray.length; i++){
      if(sum!=myArray[i]) return false;
    }
    return true;
  }
}