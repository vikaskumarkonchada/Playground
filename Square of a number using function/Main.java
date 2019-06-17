import java.util.Scanner;
class Main{
  public static int Square(int num){
    int sod = num*num;
    return sod;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sod1 = Square(n);
    System.out.print(sod1);
  }
}