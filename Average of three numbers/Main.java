import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int i = (n1+n2+n)/3;
    System.out.print(i);
  }
}