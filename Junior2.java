public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    int sum = 0;
    for(int i = 0; i <= y; i++){
      sum += x*Math.pow(10,i);
    }
    System.out.println(sum);
  }
}