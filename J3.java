public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    int W = 0;
    for(int i = 0; i < 6; i++){
      String temp = in.next();
      if(temp.equals("W")){
        W++;
      }
    }
    if(W>=5) System.out.println("1");
    else if(W>=3) System.out.println("2");
    else if(W>=1) System.out.println("3");
    else System.out.println("-1");
  }
}